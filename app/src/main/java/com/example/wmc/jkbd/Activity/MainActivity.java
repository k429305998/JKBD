package com.example.wmc.jkbd.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.wmc.jkbd.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test(View view) {
        startActivity(new Intent(MainActivity.this,ExamActivity.class));
    }
    public void exit(View view) {
        finish();
    }
}
