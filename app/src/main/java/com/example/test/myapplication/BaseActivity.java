package com.example.test.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

public class BaseActivity extends Activity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        test("base    test");
    }

    protected void test(final String s){
        new Thread(new Runnable() {
            @Override
            public void run() {
            }
        }).start();

    }



}
