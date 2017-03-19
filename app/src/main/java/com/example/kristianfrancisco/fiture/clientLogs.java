package com.example.kristianfrancisco.fiture;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class clientLogs extends AppCompatActivity {

    TabLayout tabLayout;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_client_logs);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setTitle("Client Logs");
        setSupportActionBar(toolbar);
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.content_frame_instructor, new HomeMenuInstructor())
//                        .commit();
//                getSupportActionBar().setDisplayHomeAsUpEnabled(false);
//                getSupportActionBar().setTitle("Client Logs");
//            }
//        });

        tabLayout = (TabLayout)findViewById(R.id.client_log_tab);
        frameLayout = (FrameLayout) findViewById(R.id.client_log_frame);
        //fragmentManager = ;
        tabLayout.addTab(tabLayout.newTab().setText("Clients"));
        tabLayout.addTab(tabLayout.newTab().setText("View Schedule"));

        //getSupportFragmentManager().beginTransaction().add(R.id.client_log_frame,new inside_client_logs_instructor()).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.client_log_frame,new inside_client_logs_instructor()).commit();
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0){
                    getSupportFragmentManager().beginTransaction().replace(R.id.client_log_frame,new inside_client_logs_instructor()).addToBackStack(null).commit();
                }
                else if(tab.getPosition() == 1){
                    getSupportFragmentManager().beginTransaction().replace(R.id.client_log_frame,new client_log_schedule_fragment()).addToBackStack(null).commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View rootView = inflater.inflate(R.layout.fragment_client_logs,container,false);
//
//        tabLayout = (TabLayout) rootView.findViewById(R.id.client_log_tab);
//        frameLayout = (FrameLayout) rootView.findViewById(R.id.client_log_frame);
//        //fragmentManager = ;
//        tabLayout.addTab(tabLayout.newTab().setText("Attendance"));
//        tabLayout.addTab(tabLayout.newTab().setText("Clients"));
//        tabLayout.addTab(tabLayout.newTab().setText("View Schedule"));
//
//        //.beginTransaction().replace(R.id.client_log_frame,new inside_client_logs_instructor()).addToBackStack(null).commit();
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                if(tab.getPosition() == 0){
//                    fragmentManager.beginTransaction().replace(R.id.client_log_frame,new inside_client_logs_instructor()).addToBackStack(null).commit();
//                }
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//
//
//
//        return rootView;
//    }

}
