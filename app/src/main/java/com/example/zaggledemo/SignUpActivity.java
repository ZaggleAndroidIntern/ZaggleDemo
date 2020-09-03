package com.example.zaggledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {
    public void forgot(View view){
        Intent intent = new Intent(getApplicationContext(),otpActivity.class);
        startActivity(intent);
    }
    public void login(View view){
        Intent i=new Intent(SignUpActivity.this,LoginActivity.class);
        startActivity(i);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
}