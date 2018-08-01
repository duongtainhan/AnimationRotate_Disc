package com.example.duongtainhan555.animationrotate_disc;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgDisc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Init
        Init();
        //EventClick
        EventClick();
    }
    private void Init()
    {
        imgDisc = findViewById(R.id.imgDisc);
    }
    private void EventClick()
    {
        final Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.rotate_disc);
        imgDisc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgDisc.startAnimation(animation1);
            }
        });
    }
}
