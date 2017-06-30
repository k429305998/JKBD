package com.example.wmc.jkbd;

import android.app.Application;
import com.example.wmc.jkbd.bean.Question;
import com.example.wmc.jkbd.bean.Examination;

import java.util.List;

/**
 * Created by Administrator on 2017/6/30.
 */

public class ExamApplication extends Application {
    Examination mExamInfo;
    List<Question> mExamList;
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
