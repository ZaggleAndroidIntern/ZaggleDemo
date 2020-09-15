package com.example.zaggledemo;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChangeActivity extends AppCompatActivity {

    TextView textCountDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);

        textCountDown = (TextView) findViewById(R.id.textCountdown);
        new CountDownTimer(60000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textCountDown.setText("00:"+ millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                textCountDown.setText("00:00");
            }
        }.start();
    }
}
