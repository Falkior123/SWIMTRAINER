package com.example.swimtrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Glowne extends AppCompatActivity {
TextView obrazek1;
TextView obrazek2;
TextView obrazek3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_glowne);





       TextView plany = (TextView) findViewById(R.id.textView63);
        plany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), PlanyTreningowe.class);
                startActivity(startIntent);
            }

            {

            }

        });
        TextView style = (TextView) findViewById(R.id.textView64);
        style.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), Cwiczenia.class);
                startActivity(startIntent);
            }

            {

            }

        });
        TextView rekordy = (TextView) findViewById(R.id.textView65);
        rekordy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), rekord.class);
                startActivity(startIntent);
            }

            {

            }

        });

    }
}

