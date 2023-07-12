package com.example.metamind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UiUx extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_ux);
        c1= findViewById(R.id.card6);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card6.class);
                startActivity(i1);
            }
        });
        c2 = findViewById(R.id.card7);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card7.class);
                startActivity(i1);
            }
        });
        c3= findViewById(R.id.card8);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card8.class);
                startActivity(i1);
            }
        });
        c4= findViewById(R.id.card9);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card9.class);
                startActivity(i1);
            }
        });
        c5= findViewById(R.id.card10);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),card10.class);
                startActivity(i1);
            }
        });

    }
}