package com.example.duongtainhan555.animationrotate_disc;

import android.animation.ObjectAnimator;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnPlay, btnPause;
    private ObjectAnimator anim;
    private ImageView imgDisc;
    private boolean status = true;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Init
        Init();
        CreateAnimation(0,5000,20000);
        //EventClickPlay
        btnPlay.setVisibility(View.VISIBLE);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayDisc();
                btnPause.setVisibility(View.VISIBLE);
                btnPlay.setVisibility(View.INVISIBLE);
            }
        });
        //EventClickPause
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PauseDisc();
                btnPlay.setVisibility(View.VISIBLE);
                btnPause.setVisibility(View.INVISIBLE);
            }
        });

    }
    private void Init()
    {
        imgDisc = findViewById(R.id.imgDisc);
        btnPlay = findViewById(R.id.btnPlay);
        btnPause = findViewById(R.id.btnPause);

    }
    private void CreateAnimation(int from_degrees, int to_degrees, int duration)
    {
        anim = ObjectAnimator.ofFloat(imgDisc,"rotation",from_degrees,to_degrees);
        anim.setDuration(duration);
    }
    private void PlayDisc()
    {
        if(status)
        {
            anim.start();
        }
        else
        {
            anim.resume();
        }
    }
    private void PauseDisc()
    {
        anim.pause();
        status = false;
    }
}
