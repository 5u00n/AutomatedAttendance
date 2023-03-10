package com.ashish.automatedattendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.ashish.automatedattendance.Login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkAuth();
    }

    private void checkAuth() {
        startActivity(new Intent(this, LoginActivity.class));
    }
}