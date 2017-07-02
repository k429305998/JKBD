package com.example.wmc.jkbd;

import android.app.Application;
import android.util.Log;

import com.example.wmc.jkbd.bean.Examination;
import com.example.wmc.jkbd.bean.Question;
import com.example.wmc.jkbd.bean.resource;
import com.example.wmc.jkbd.utils.OkHttpUtils;
import com.example.wmc.jkbd.utils.ResultUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/6/30.
 */

public class ExamApplication extends Application {
    Examination mExamInfo;
    List<Question> mExamList;
    private static ExamApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        initData();
    }

    public static ExamApplication getInstance(){
        return instance;
    }

    private void initData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                OkHttpUtils<Examination> utils = new OkHttpUtils<>(instance);
                String uri = "http://101.251.196.90:8080/JztkServer/examInfo";
                utils.url(uri)
                        .targetClass(Examination.class)
                        .execute(new OkHttpUtils.OnCompleteListener<Examination>() {
                            @Override
                            public void onSuccess(Examination result) {
                                Log.e("main","result="+result);
                                mExamInfo = result;
                            }

                            @Override
                            public void onError(String error) {
                                Log.e("main","error="+error);
                            }
                        });


                OkHttpUtils<String> utils1 = new OkHttpUtils<>(instance);
                String url2 = "http://101.251.196.90:8080/JztkServer/getQuestions?testType=rand";
                utils1.url(url2)
                        .targetClass(String.class)
                        .execute(new OkHttpUtils.OnCompleteListener<String>() {
                            @Override
                            public void onSuccess(String jsonStr) {
                                resource result = ResultUtils.getListResultFromJson(jsonStr);
                                if (result!=null && result.getError_code()==0){
                                    List<Question> list = result.getResult();
                                    if (list!=null && list.size()>0){
                                        mExamList = list;
                                    }
                                }
                            }

                            @Override
                            public void onError(String error) {
                                Log.e("main","error="+error);
                            }
                        });
            }
        }).start();
    }

    public Examination getExamInfo() {
        return mExamInfo;
    }

    public void setExamInfo(Examination examInfo) {
        mExamInfo = examInfo;
    }

    public List<Question> getExamList() {
        return mExamList;
    }

    public void setExamList(List<Question> examList) {
        mExamList = examList;
    }
}