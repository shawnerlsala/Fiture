package com.example.kristianfrancisco.fiture;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class startUpActivity extends AppCompatActivity {

    Button startWorkout;
    HomeAcitvity hm = new HomeAcitvity();
    int a = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);



        Level1StartUp framgentLevel1 = new Level1StartUp();
        final WorkoutSummary workoutSummary = new WorkoutSummary();
        final Level2StartUp fragmentLevel2 = new Level2StartUp();
        final CongratulationsFragment congratulationsFragment = new CongratulationsFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.frame,framgentLevel1).commit();

        startWorkout = (Button)findViewById(R.id.start);
        startWorkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==0) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragmentLevel2).commit();
                    a++;
                }else if(a==1){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,workoutSummary).commit();
                    a++;
                    Toast.makeText(startUpActivity.this, "workout summary unta", Toast.LENGTH_SHORT).show();
                }else if(a==2){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,congratulationsFragment).commit();
                    a++;
                }else{
                    Intent intent = new Intent(startUpActivity.this,HomeAcitvity.class);
                    //hm.switchFragmentHome(0);
                    startActivity(intent);
                }

            }
        });

    }
}
