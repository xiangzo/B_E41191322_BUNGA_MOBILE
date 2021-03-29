package com.example.layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void linear(View view) {
        Intent intent = new Intent(MainActivity.this, LinearLayout.class);
        startActivity(intent);
    }

    public void relative(View view) {
        Intent intent = new Intent(MainActivity.this, RelativeLayout.class);
        startActivity(intent);
    }

    public void constraint(View view) {
        Intent intent = new Intent(MainActivity.this, ConstraintLayout.class);
        startActivity(intent);
    }

    public void frame(View view) {
        Intent intent = new Intent(MainActivity.this, FrameLayout.class);
        startActivity(intent);
    }

    public void tabel(View view) {
        Intent intent = new Intent(MainActivity.this, TabelLayout.class);
        startActivity(intent);
    }

    public void material(View view) {
        Intent intent = new Intent(MainActivity.this, MaterialDesign.class);
        startActivity(intent);
    }

    public void scroll(View view) {
        Intent intent = new Intent(MainActivity.this, ScrollView.class);
        startActivity(intent);
    }

    public void scroll2(View view) {
        Intent intent = new Intent(MainActivity.this, ScrollViewHorizontal.class);
        startActivity(intent);
    }

}