package com.example.lab2_alif;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button openActivity;
    Button openActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openActivity = (Button) findViewById(R.id.button);

    }
    public void openActivity2 (View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}