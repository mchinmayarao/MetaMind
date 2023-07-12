package com.example.metamind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Research extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research);
        c1= findViewById(R.id.card46);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card46.class);
                startActivity(i1);
            }
        });
        c2 = findViewById(R.id.card47);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card47.class);
                startActivity(i1);
            }
        });
        c3= findViewById(R.id.card48);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card48.class);
                startActivity(i1);
            }
        });
        c4= findViewById(R.id.card49);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card49.class);
                startActivity(i1);
            }
        });
        c5= findViewById(R.id.card50);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card50.class);
                startActivity(i1);
            }
        });

    }
}