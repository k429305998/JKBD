package com.example.wmc.jkbd;

import android.app.Application;

import com.example.wmc.jkbd.bean.Examination;
import com.example.wmc.jkbd.bean.Question;
import com.example.wmc.jkbd.biz.ExamBiz;
import com.example.wmc.jkbd.biz.IExamBiz;

import java.util.List;

/**
 * Created by Administrator on 2017/6/30.
 */

public class ExamApplication extends Application {
    Examination mExamInfo;
    List<Question> mExamList;
    private static ExamApplication instance;
    IExamBiz biz;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        biz = new ExamBiz();
        initData();
    }

    public static ExamApplication getInstance(){
        return instance;
    }

    private void initData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                biz.beginExam();
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
