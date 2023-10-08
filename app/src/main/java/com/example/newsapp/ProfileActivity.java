package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ProfileActivity extends AppCompatActivity {

    private ImageButton homeBtn3, regBtn3, profileBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
         homeBtn3 = findViewById(R.id.idHomeBtn);
         regBtn3 = findViewById(R.id.idRegBtn);
        profileBtn3 = findViewById(R.id.idProfileBtn);

        homeBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(home);
            }
        });

        regBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg = new Intent(ProfileActivity.this, RegActivity.class);
                startActivity(reg);
            }
        });

        profileBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg = new Intent(ProfileActivity.this, ProfileActivity.class);
                startActivity(reg);
            }
        });
    }
}