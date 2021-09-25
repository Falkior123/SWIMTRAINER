package com.example.swimtrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Cwiczenia extends AppCompatActivity {
ImageView cw1;
ImageView cw2;
ImageView cw3;
ImageView cw4;
ImageView cw5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_cwiczenia);

        cw1=findViewById(R.id.imageView9);
        cw2=findViewById(R.id.imageView5);
        cw3=findViewById(R.id.imageView6);
        cw4=findViewById(R.id.imageView7);
        cw5=findViewById(R.id.imageView8);


        cw1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=V9D490nG2qY&ab_channel=Ku%C5%BAniaWroc%C5%82awKu%C5%BAniaWroc%C5%82aw/");
            }
        });
        cw2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=6yGsKt6dsKw&ab_channel=Ku%C5%BAniaWroc%C5%82awKu%C5%BAniaWroc%C5%82aw");
            }
        });
        cw3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=L-Rxpga4il0&ab_channel=Ku%C5%BAniaWroc%C5%82awKu%C5%BAniaWroc%C5%82aw");
            }
        });
        cw4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=nMDFk41uHYQ&ab_channel=Ku%C5%BAniaWroc%C5%82awKu%C5%BAniaWroc%C5%82aw");
            }
        });
        cw5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=014zsAqM5rY&ab_channel=Swim4smileSwim4smile");
            }
        });
    }

    private void gotoUrl(String s) {


        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
    }
