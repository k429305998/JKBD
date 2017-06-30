package com.example.wmc.jkbd.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.wmc.jkbd.R;

/**
 * Created by Link on 2017/6/30.
 */

public class ExamActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        initDate();
    }

    private void initDate() {

    }
}
