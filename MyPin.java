package com.example.aahaarapp;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;



public class MyPin extends AppCompatActivity {

    public CardView definebiogas,matreq,setup,safety,utilize,benefits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypin);

        definebiogas =findViewById(R.id.definebiogas);
        benefits = findViewById(R.id.benefits);
        matreq = findViewById(R.id.matreq);
        setup = findViewById(R.id.setup);
        safety = findViewById(R.id.safety);
        utilize= findViewById(R.id.utilize);

        definebiogas.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DefineBiogas.class);
                startActivity(intent);
            }
        });
        matreq.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MatReq.class);
                startActivity(intent);
            }
        });
        benefits.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BenefitsBiogas.class);
                startActivity(intent);
            }
        });
        setup.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SetupBiogas.class);
                startActivity(intent);
            }
        });
        safety.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SafetyBiogas.class);
                startActivity(intent);
            }
        });
        utilize.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UtilizeBiogas.class);
                startActivity(intent);
            }
        });
    }
    }

