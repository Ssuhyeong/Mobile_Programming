package org.techtown.myalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.photo_btn1);
        b2 = findViewById(R.id.photo_btn2);
        b3 = findViewById(R.id.photo_btn3);
        b4 = findViewById(R.id.photo_btn4);
        b5 = findViewById(R.id.photo_btn5);
        b6 = findViewById(R.id.photo_btn6);
        b7 = findViewById(R.id.photo_btn7);
        b8 = findViewById(R.id.photo_btn8);
        b9 = findViewById(R.id.photo_btn9);
        b10 = findViewById(R.id.photo_btn10);


        image = findViewById(R.id.image);
        image.bringToFront();

        b2.setAlpha(0.3f);
        b3.setAlpha(0.3f);
        b4.setAlpha(0.3f);
        b5.setAlpha(0.3f);
        b6.setAlpha(0.3f);
        b7.setAlpha(0.3f);
        b8.setAlpha(0.3f);
        b9.setAlpha(0.3f);
        b10.setAlpha(0.3f);


        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.photo1);
                b1.setAlpha(1.0f);
                b2.setAlpha(0.3f);
                b3.setAlpha(0.3f);
                b4.setAlpha(0.3f);
                b5.setAlpha(0.3f);
                b6.setAlpha(0.3f);
                b7.setAlpha(0.3f);
                b8.setAlpha(0.3f);
                b9.setAlpha(0.3f);
                b10.setAlpha(0.3f);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.photo2);
                b1.setAlpha(0.3f);
                b2.setAlpha(1.0f);
                b3.setAlpha(0.3f);
                b4.setAlpha(0.3f);
                b5.setAlpha(0.3f);
                b6.setAlpha(0.3f);
                b7.setAlpha(0.3f);
                b8.setAlpha(0.3f);
                b9.setAlpha(0.3f);
                b10.setAlpha(0.3f);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.photo3);
                b1.setAlpha(0.3f);
                b2.setAlpha(0.3f);
                b3.setAlpha(1.0f);
                b4.setAlpha(0.3f);
                b5.setAlpha(0.3f);
                b6.setAlpha(0.3f);
                b7.setAlpha(0.3f);
                b8.setAlpha(0.3f);
                b9.setAlpha(0.3f);
                b10.setAlpha(0.3f);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.photo4);
                b1.setAlpha(0.3f);
                b2.setAlpha(0.3f);
                b3.setAlpha(0.3f);
                b4.setAlpha(1.0f);
                b5.setAlpha(0.3f);
                b6.setAlpha(0.3f);
                b7.setAlpha(0.3f);
                b8.setAlpha(0.3f);
                b9.setAlpha(0.3f);
                b10.setAlpha(0.3f);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.photo5);
                b1.setAlpha(0.3f);
                b2.setAlpha(0.3f);
                b3.setAlpha(0.3f);
                b4.setAlpha(0.3f);
                b5.setAlpha(1.0f);
                b6.setAlpha(0.3f);
                b7.setAlpha(0.3f);
                b8.setAlpha(0.3f);
                b9.setAlpha(0.3f);
                b10.setAlpha(0.3f);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.photo6);
                b1.setAlpha(0.3f);
                b2.setAlpha(0.3f);
                b3.setAlpha(0.3f);
                b4.setAlpha(0.3f);
                b5.setAlpha(0.3f);
                b6.setAlpha(1.0f);
                b7.setAlpha(0.3f);
                b8.setAlpha(0.3f);
                b9.setAlpha(0.3f);
                b10.setAlpha(0.3f);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.photo7);
                b1.setAlpha(0.3f);
                b2.setAlpha(0.3f);
                b3.setAlpha(0.3f);
                b4.setAlpha(0.3f);
                b5.setAlpha(0.3f);
                b6.setAlpha(0.3f);
                b7.setAlpha(1.0f);
                b8.setAlpha(0.3f);
                b9.setAlpha(0.3f);
                b10.setAlpha(0.3f);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.photo8);
                b1.setAlpha(0.3f);
                b2.setAlpha(0.3f);
                b3.setAlpha(0.3f);
                b4.setAlpha(0.3f);
                b5.setAlpha(0.3f);
                b6.setAlpha(0.3f);
                b7.setAlpha(0.3f);
                b8.setAlpha(1.0f);
                b9.setAlpha(0.3f);
                b10.setAlpha(0.3f);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.photo9);
                b1.setAlpha(0.3f);
                b2.setAlpha(0.3f);
                b3.setAlpha(0.3f);
                b4.setAlpha(0.3f);
                b5.setAlpha(0.3f);
                b6.setAlpha(0.3f);
                b7.setAlpha(0.3f);
                b8.setAlpha(0.3f);
                b9.setAlpha(1.0f);
                b10.setAlpha(0.3f);
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.photo10);
                b1.setAlpha(0.3f);
                b2.setAlpha(0.3f);
                b3.setAlpha(0.3f);
                b4.setAlpha(0.3f);
                b5.setAlpha(0.3f);
                b6.setAlpha(0.3f);
                b7.setAlpha(0.3f);
                b8.setAlpha(0.3f);
                b9.setAlpha(0.3f);
                b10.setAlpha(1.0f);
            }
        });
    }
}