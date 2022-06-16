package com.developer.happypaws4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
    }

    public void onClickGoToForgotPassword(View view) {
        startActivity(new Intent(getApplicationContext(),ActivityForgotPassword.class));
    }

    public void onClickGoToSignUp(View view) {
        startActivity(new Intent(getApplicationContext(),ActivitySignup.class));
    }
}