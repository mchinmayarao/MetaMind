package com.example.metamind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CopyWriting extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copy_writting);
        c1= findViewById(R.id.card16);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card16.class);
                startActivity(i1);
            }
        });
        c2 = findViewById(R.id.card17);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card17.class);
                startActivity(i1);
            }
        });
        c3= findViewById(R.id.card18);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card18.class);
                startActivity(i1);
            }
        });
        c4= findViewById(R.id.card19);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card19.class);
                startActivity(i1);
            }
        });
        c5= findViewById(R.id.card20);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card20.class);
                startActivity(i1);
            }
        });

    }
}