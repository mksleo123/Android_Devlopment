package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview=findViewById(R.id.textView2);
        button=findViewById(R.id.button2);
        editText=findViewById(R.id.editText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                String s =editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.205*kg;
//                String s2="The Corresponding Value Of Pound is "+pound;
//                textview.setText("The Corresponding Value Of Pound is "+pound);
//                Toast.makeText(MainActivity.this, s2, Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    public void calculate(View view) {
        String s =editText.getText().toString();
               int kg = Integer.parseInt(s);
                double pound = 2.205*kg;
                String s2="The Corresponding Value Of Pound is "+pound;
                textview.setText("The Corresponding Value Of Pound is "+pound);
                Toast.makeText(MainActivity.this, s2, Toast.LENGTH_SHORT).show();
    }
}