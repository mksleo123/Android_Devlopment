package com.example.layoutspractise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textview=findViewById(R.id.textview2);
        Intent intent=getIntent();

        String name=intent.getStringExtra(MainActivity.EXTRA_NAME);
        textview.setText("your name is "+name);
    }
}