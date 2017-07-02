package com.example.wmc.jkbd;

import android.app.Application;

import com.example.wmc.jkbd.bean.Examination;
import com.example.wmc.jkbd.bean.Question;

import java.util.List;

/**
 * Created by Administrator on 2017/6/30.
 */

public class ExamApplication extends Application {
    public static String LOAD_EXAM_INFO = "load_exam_info";
    public static String LOAD_EXAM_QUESTION = "load_exam_question";
    public static String LOAD_DATA_SUCCESS = "load_data_success";
    Examination mExamInfo;
    List<Question> mExamList;
    private static ExamApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static ExamApplication getInstance(){
        return instance;
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
