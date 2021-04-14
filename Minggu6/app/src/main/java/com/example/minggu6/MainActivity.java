package com.example.minggu6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void explicit(View view){
        Intent intent = new Intent(MainActivity.this, Explicit.class);
        startActivity(intent);
    }

    public void implicit(View view){
        Intent intent = new Intent(MainActivity.this, Implicit.class);
        startActivity(intent);
    }
}