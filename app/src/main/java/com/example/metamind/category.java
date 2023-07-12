package com.example.metamind;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class category extends AppCompatActivity {

    private CardView chatbot,uiux,ec,cw,logo,code,developer,texttospeech,music,research;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        chatbot = (CardView) findViewById(R.id.c1);
        chatbot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(), ChatBot.class);
                startActivity(i1);
            }
        });
        uiux = (CardView) findViewById(R.id.c2);
        uiux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), UiUx.class);
                startActivity(i2);
            }
        });
        ec = (CardView) findViewById(R.id.c3);
        ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(getApplicationContext(), Ecommerce.class);
                startActivity(i3);
            }
        });
        cw = (CardView) findViewById(R.id.c4);
        cw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(getApplicationContext(), CopyWriting.class);
                startActivity(i4);
            }
        });
        logo = findViewById(R.id.c5);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity
                Intent intent = new Intent(category.this, LogoGenerator.class);
                startActivity(intent);
            }
        });
        code = (CardView) findViewById(R.id.c6);
        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(getApplicationContext(), CodeAssistant.class);
                startActivity(i6);
            }
        });
        developer = (CardView) findViewById(R.id.c7);
        developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7 = new Intent(getApplicationContext(), DeveloperTools.class);
                startActivity(i7);
            }
        });
        texttospeech = (CardView) findViewById(R.id.c8);
        texttospeech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8 = new Intent(getApplicationContext(), TextToSpeech.class);
                startActivity(i8);
            }
        });
        music = (CardView) findViewById(R.id.c9);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i9 = new Intent(getApplicationContext(), Music.class);
                startActivity(i9);
            }
        });
        research = (CardView) findViewById(R.id.c10);
        research.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i10 = new Intent(getApplicationContext(), Research.class);
                startActivity(i10);
            }
        });
    }
}