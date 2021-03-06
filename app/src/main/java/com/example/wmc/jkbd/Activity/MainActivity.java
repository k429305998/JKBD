package com.example.wmc.jkbd.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import com.example.wmc.jkbd.bean.Examination;
 import com.example.wmc.jkbd.utils.OkHttpUtils;
import android.support.v7.app.AppCompatActivity;

import com.example.wmc.jkbd.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test(View view) {
        new Thread(new Runnable() {
            @Override
            public void run() {

                OkHttpUtils<Examination> utils = new OkHttpUtils<>(getApplicationContext());
                String uri = "http://101.251.196.90:8080/JztkServer/examInfo";
                utils.url(uri)
                        .targetClass(Examination.class)
                        .execute(new OkHttpUtils.OnCompleteListener<Examination>() {
                            @Override
                            public void onSuccess(Examination result) {
                                Log.e("main","result="+result);
                            }

                            @Override
                            public void onError(String error) {
                                Log.e("main","error="+error);
                            }
                        });
            }
        }).start();
        startActivity(new Intent(MainActivity.this,ExamActivity.class));
    }
    public void exit(View view) {
        finish();
    }
}
