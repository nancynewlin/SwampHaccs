package com.example.koenf.dietpage;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;

public class DietActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_diet);


        @SuppressLint("WrongViewCast") final Button fishButton = findViewById(R.id.fishButton);
        fishButton.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent intent = new Intent(DietActivity.this, DietActivity2.class);
                startActivity(intent);
            }
        });

        @SuppressLint("WrongViewCast") final Button vegButton = findViewById(R.id.vegButton);
        vegButton.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent intent = new Intent(DietActivity.this, DietActivity2.class);
                startActivity(intent);
            }
        });

        @SuppressLint("WrongViewCast") final Button oilButton = findViewById(R.id.oilButton);
        oilButton.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent intent = new Intent(DietActivity.this, DietActivity2.class);
                startActivity(intent);
            }
        });

        @SuppressLint("WrongViewCast") final Button cowButton = findViewById(R.id.cowButton);
        cowButton.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent intent = new Intent(DietActivity.this, DietActivity2.class);
                startActivity(intent);

            }
        });

        @SuppressLint("WrongViewCast") final Button nonButton = findViewById(R.id.nonButton);
        nonButton.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent intent = new Intent(DietActivity.this, Information.class);
                startActivity(intent);
            }
        });
    }}



