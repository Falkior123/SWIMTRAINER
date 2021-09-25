package com.example.swimtrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class PlanyTreningowe extends AppCompatActivity {
TextView text;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_plany_treningowe);


        text = (TextView) findViewById(R.id.plan1);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), plan11.class);
                startActivity(startIntent);

            }

            {

            }

        });
        text1 = (TextView) findViewById(R.id.plan2);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), plan2.class);
                startActivity(startIntent);
            }

            {

            }

        });
        text2 = (TextView) findViewById(R.id.plan3);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), plan3.class);
                startActivity(startIntent);
            }

            {

            }

        });
        text3 = (TextView) findViewById(R.id.plan4);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), plan4.class);
                startActivity(startIntent);
            }

            {

            }

        });
        text4 = (TextView) findViewById(R.id.plan5);
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), plan5.class);
                startActivity(startIntent);
            }

            {

            }

        });

    }
}
