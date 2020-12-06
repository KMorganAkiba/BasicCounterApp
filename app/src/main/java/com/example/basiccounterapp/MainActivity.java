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
        count = count+1;
        String newCount = String.valueOf(count);
        counter.setText(newCount);
        System.out.println(count);
    }
}