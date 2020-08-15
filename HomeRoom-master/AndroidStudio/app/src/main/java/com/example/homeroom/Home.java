package com.example.homeroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Home extends AppCompatActivity {
    private FloatingActionButton scheduleButton;
    private FloatingActionButton profileButton;
    private FloatingActionButton messageButton;
    private FloatingActionButton settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //initialize button for changing to schedule page
        scheduleButton = findViewById(R.id.buttonSchedule);
        scheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSchedule();
            }
        });

        //initialize button for changing to profile page
        profileButton = findViewById(R.id.buttonProfile);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });

        //initialize button for changing to profile page
        messageButton = findViewById(R.id.buttonMessage);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMessage();
            }
        });

    }

    //methods for buttons to change activities
    public void openSchedule(){
        Intent intent = new Intent(this, Schedule.class);
        startActivity(intent);
    }
    public void openProfile(){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
    public void openMessage(){
        Intent intent = new Intent(this, Message.class);
        startActivity(intent);
    }

}
