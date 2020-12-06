package com.example.basiccounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count;
    TextView counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Counter Application");
        setContentView(R.layout.activity_main);
        counter = findViewById(R.id.counterTextField);
    }

    public void increaseCount(View view) {
        count = ++count;
        String newCount = String.valueOf(count);
        counter.setText(newCount);

    }

    public void decreaseCount(View view) {
        count = --count;
        String newCount = String.valueOf(count);
        counter.setText(newCount);
    }

    public void resetCount(View view) {
        count = 0;
        String newCount = String.valueOf(count);
        counter.setText(newCount);
    }
}