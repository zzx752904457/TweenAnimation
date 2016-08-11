package com.dialogdemo.admin.mydialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new MyDialog(MainActivity.this).showDialog(R.layout.dialog_layout, 0, 500);
//            }
//        });
        findViewById(R.id.tv).startAnimation(AnimationUtils.loadAnimation(this, R.anim.beautiful_zhendong));
    }
}
