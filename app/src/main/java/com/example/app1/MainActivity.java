package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: This is lecture 2020-09-28 - 4th video

        TextView textView = findViewById(R.id.txtViewMessage);
        textView.setText("Is the text changed?");
    }
}