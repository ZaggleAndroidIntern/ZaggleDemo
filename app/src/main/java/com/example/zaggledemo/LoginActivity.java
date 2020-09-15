package com.example.zaggledemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    private EditText mEmail,mPassword;
    private Button mLogin;
    private FirebaseAuth auth;

    public void signUp(View view){
        Intent intent=new Intent(LoginActivity.this,SignUpActivity.class);
        startActivity(intent);
    }
    public void forgotPassword(View view){
        Intent intent=new Intent(LoginActivity.this,otpActivity.class);
        startActivity(intent);
    }
    public void loginClick(View view) {
        String email = mEmail.getText().toString();
        String pass = mPassword.getText().toString();
        if (email.isEmpty() || pass.isEmpty())
            Toast.makeText(LoginActivity.this, " Field Empty ", Toast.LENGTH_SHORT).show();
        else
            signIn(email, pass);
    }

    public void signIn(String email,String password){
        auth.signInWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Intent i=new Intent(LoginActivity.this,HomeActivity.class);
                startActivity(i);
                finish();
            }

        });


    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mEmail=findViewById(R.id.username);
        mPassword=findViewById(R.id.password);
        auth=FirebaseAuth.getInstance();
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