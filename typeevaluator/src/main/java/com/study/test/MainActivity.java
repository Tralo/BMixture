package com.study.test;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private CircleView mCircleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCircleView = findViewById(R.id.cv);
        start1();

    }

    private void start1() {
        Circle startCircle = new Circle(168, Color.RED, 0);
        Circle middleCircle = new Circle(300, Color.GREEN, 15);
        Circle endCircle = new Circle(450, Color.BLUE, 30);
        ObjectAnimator.ofObject(mCircleView, "circle", new CircleEvaluator(), startCircle, middleCircle, endCircle)
                .setDuration(5000)
                .start();
    }




}
