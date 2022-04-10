package com.example.hw_androidlogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    final String CLASS_NAME = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // adding the logs
        Log.d(CLASS_NAME, "1hung");
        Log.w(CLASS_NAME, "3gas");

    }
}