package com.example.zaggledemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class otpActivity extends AppCompatActivity {

    public void send(View view){
        Intent intent = new Intent(getApplicationContext(),ChangeActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
    }
}
