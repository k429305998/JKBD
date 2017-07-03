package com.example.wmc.jkbd.biz;

import com.example.wmc.jkbd.bean.Question;

/**
 * Created by Link on 2017/7/2.
 */

public interface IExamBiz {
    void beginExam();
    Question getExam();
    Question nextQuestion();
    Question preQuestion();
    void commitExam();
    String getExamIndex();
}
