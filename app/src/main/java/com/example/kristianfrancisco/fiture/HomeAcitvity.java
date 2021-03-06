package com.example.kristianfrancisco.fiture;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.example.kristianfrancisco.fiture.FragmentChallengesClient.Level1Client;

public class HomeAcitvity extends AppCompatActivity {

    private static HomeMenu fragmentMenu = new HomeMenu();
    private static profile fragmentProfile = new profile();
    private static findInstructor fragmentFindInstructor = new findInstructor();
    private static progress fragmentProgress = new progress();
    private static WorkOutLog fragmentWorkOutLog = new WorkOutLog();
    private static startUp fragmentStartUp = new startUp();
    private static LeaderBoard fragmentLeaderBoard = new LeaderBoard();
    private static videos fragmentVideos = new videos();
    private static challenges fragmentChallenges = new challenges();
    private static InstructorProfile fragmentinstructorProfile = new InstructorProfile();
    private static Level1Client level1Client = new Level1Client();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_acitvity);

        fragmentMenu.setParent(this);
        fragmentProfile.setParentActivity(this);
        fragmentFindInstructor.setParentActivity(this);
        fragmentinstructorProfile.setParentActivity(this);
        level1Client.setParent(this);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_content_frame, fragmentMenu)
                        .commit();
                getSupportActionBar().setDisplayHomeAsUpEnabled(false);
                getSupportActionBar().setTitle("Fiture");
            }
        });

        getSupportActionBar().setTitle("Home");

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.home_content_frame, fragmentMenu)
                .commit();

        Toast.makeText(this, "START", Toast.LENGTH_LONG).show();

    }

    public void switchFragmentHome(int num){

        switch(num){
            case 0: getSupportFragmentManager().beginTransaction()
                    .replace(R.id.home_content_frame, fragmentMenu)
                    .commit();
                break;

            case 1:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_content_frame, fragmentProfile)
                        .addToBackStack(null)
                        .commit();
                getSupportActionBar().setTitle("Profile");

                break;

            case 2:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_content_frame, fragmentFindInstructor)
                        .addToBackStack(null)
                        .commit();
                getSupportActionBar().setTitle("Find Instructor");
                break;

            case 3:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_content_frame, fragmentProgress)
                        .addToBackStack(null)
                        .commit();
                getSupportActionBar().setTitle("Progress");
                break;

            case 4:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_content_frame, fragmentWorkOutLog)
                        .addToBackStack(null)
                        .commit();
                getSupportActionBar().setTitle("Work Out Log");
                break;

            case 5:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_content_frame, fragmentStartUp)
                        .addToBackStack(null)
                        .commit();
                getSupportActionBar().setTitle("Start Up");
                break;

            case 6:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_content_frame, fragmentLeaderBoard)
                        .addToBackStack(null)
                        .commit();
                getSupportActionBar().setTitle("LeaderBoard");
                break;

            case 7:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_content_frame, fragmentVideos)
                        .addToBackStack(null)
                        .commit();
                getSupportActionBar().setTitle("Videos");
                break;

            case 8:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_content_frame, fragmentChallenges)
                        .addToBackStack(null)
                        .commit();
                getSupportActionBar().setTitle("Challenges");
                break;

            case 9:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case 10:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_content_frame,level1Client)
                        .addToBackStack(null)
                        .commit();
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void showDialogs(int identifier){

        switch (identifier){
            //find instructor dialog
            case 1:
                fragmentFindInstructor.show(getSupportFragmentManager(),"Find Instructor Fragment");
                break;
            case 2:
                fragmentinstructorProfile.show(getSupportFragmentManager(),"Instructor profile");
                break;
        }

    }

}
