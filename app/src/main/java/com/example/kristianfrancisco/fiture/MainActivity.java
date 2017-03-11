package com.example.kristianfrancisco.fiture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private static FirstScreen fragment1 = new FirstScreen();
    private static SecondScreen fragment2 = new SecondScreen();
    private static ThirdScreen fragment3 = new ThirdScreen();
    boolean client = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1.setParent(this);
        fragment2.setParent(this);
        fragment3.setParent(this);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.content_frame, fragment1)
                .commit();

    }

    public void switchFragments(int identifier){

        switch (identifier){

            case 1: getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame, fragment1)
                    .commit();
                break;
            case 2: getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame, fragment2)
                    .commit();
                break;
            case 3:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, fragment3)
                        .commit();
                break;
            case 4:
                if(client == true) {
                    Intent intent = new Intent(this, HomeAcitvity.class);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(this, HomActivityInstructor.class);
                    startActivity(intent);
                }
                finish();
                break;
        }

    }

    public void isClient(boolean bool){
        client = bool;
    }

}
