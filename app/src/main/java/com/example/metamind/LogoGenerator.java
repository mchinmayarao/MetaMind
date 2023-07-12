package com.example.metamind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LogoGenerator extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_generator);
        c1= findViewById(R.id.card21);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card21.class);
                startActivity(i1);
            }
        });
        c2 = findViewById(R.id.card22);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card22.class);
                startActivity(i1);
            }
        });
        c3= findViewById(R.id.card23);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card23.class);
                startActivity(i1);
            }
        });
        c4= findViewById(R.id.card24);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card24.class);
                startActivity(i1);
            }
        });
        c5= findViewById(R.id.card25);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card25.class);
                startActivity(i1);
            }
        });

    }
}