package com.example.zaggledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText username,password;
    Button login;
    public void signUp(View view){
        Intent intent=new Intent(LoginActivity.this,SignUpActivity.class);
        startActivity(intent);
    }
    public void forgotPassword(View view){
        Intent intent=new Intent(LoginActivity.this,ForgotPasswordActivity.class);
        startActivity(intent);
    }
    public void loginClick(View view){
        String name=username.getText().toString();
        String pass=password.getText().toString();
        Log.i("Username:",name);
        Log.i("Password:",pass);
        Toast.makeText(LoginActivity.this, "Hi "+name, Toast.LENGTH_SHORT).show();}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
       // login=findViewById(R.id.login);
//        login.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                String name=username.getText().toString();
//                String pass=password.getText().toString();
//                Log.i("Username:",name);
//                Log.i("Password:",pass);
//                Toast.makeText(LoginActivity.this, "Hi "+name, Toast.LENGTH_SHORT).show();
//            }
//        });


    }
}