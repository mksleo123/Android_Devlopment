package com.example.image_changer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    View screenView;
    Button clickMe;
    int[] images;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        images = new int[] {R.drawable.img1 ,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8};
        screenView =  findViewById(R.id.rView);
        clickMe = (Button) findViewById(R.id.button);

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aryLength = images.length;
                Random random = new Random();
                int rNum = random.nextInt(aryLength);
                screenView.setBackground(ContextCompat.getDrawable(getApplicationContext(),images[rNum]));
            }
        });
    }
}