package com.example.zhangchongshan.canvasdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(new DrawingWithBezier(this));
        setContentView(new MySurfaceView(this));
        setContentView(new TestView(this));

        // setContentView(R.layout.activity_main);
    }
}
