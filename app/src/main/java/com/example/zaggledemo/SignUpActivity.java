package com.example.zaggledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {
  private  EditText mName;
   private EditText mPassword;
    private  EditText mPhone;
    private  EditText mEmail;
    private FirebaseAuth auth;
    private Button mSignup;
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
        mEmail=findViewById(R.id.editEmail);
        mPassword=findViewById(R.id.editPassword);
        mSignup=findViewById(R.id.buttonSignUp);
        auth=FirebaseAuth.getInstance();
        mSignup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String email=mEmail.getText().toString();
                String password=mPassword.getText().toString();
                    if(TextUtils.isEmpty(email)||TextUtils.isEmpty(password))
                    Toast.makeText(SignUpActivity.this, " Field Empty ", Toast.LENGTH_SHORT).show();
                    else
                        auth.createUserWithEmailAndPassword(email,password);
            }


        });
        }
        public void registerUser(String email,String password){
        auth.createUserWithEmailAndPassword(email,password);
        }

}