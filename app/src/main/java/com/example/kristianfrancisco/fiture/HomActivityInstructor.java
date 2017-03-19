package com.example.kristianfrancisco.fiture;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class HomActivityInstructor extends AppCompatActivity {

    private static HomeMenuInstructor homeMenuInstructor = new HomeMenuInstructor();
    private static attendanceInstructor attendanceInstructor = new attendanceInstructor();
    private static clientLogs clientLogs = new clientLogs();
    private static schedule schedule = new schedule();
    private static clientsAttendance clientsAttendance = new clientsAttendance();
    private static profileInstructor profileInstructor = new profileInstructor();
    private static fitureChallenge fitureChallenge = new fitureChallenge();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hom_instructor);
        homeMenuInstructor.setParent(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame_instructor, homeMenuInstructor)
                        .commit();
                getSupportActionBar().setDisplayHomeAsUpEnabled(false);
                getSupportActionBar().setTitle("Home");
            }
        });

        getSupportActionBar().setTitle("Home");

        getSupportFragmentManager().beginTransaction()
                .add(R.id.content_frame_instructor, homeMenuInstructor)
                .commit();

    }

    public void switchFragmentsInstructor(int identifier){

        switch (identifier){

            case 1:
//                getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.content_frame_instructor, attendanceInstructor)
//                        .commit();
//                getSupportActionBar().setTitle("Attendance");
//                finish();
//                startActivity(new Intent(this,attendanceInstructor.class));
//                break;
            case 2:
//                getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.content_frame_instructor, clientLogs)
//                        .commit();
//                getSupportActionBar().setTitle("Client Logs");
                startActivity(new Intent(this,clientLogs.class));
                break;
            case 3:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame_instructor, schedule)
                        .commit();
                getSupportActionBar().setTitle("Schedule");
                break;
            case 4:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame_instructor, clientsAttendance)
                        .commit();
                getSupportActionBar().setTitle("Client's Attendance");
                break;
            case 5:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame_instructor, profileInstructor)
                        .commit();
                getSupportActionBar().setTitle("Profile");
                break;
            case 6:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case 7:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame_instructor, fitureChallenge)
                        .commit();
                getSupportActionBar().setTitle("Fiture Challenge");
                break;

        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
