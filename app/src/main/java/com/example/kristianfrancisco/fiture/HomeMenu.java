package com.example.kristianfrancisco.fiture;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeMenu extends Fragment implements View.OnClickListener {


    private HomeAcitvity homeAcitvity;

    public HomeMenu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home_menu, container, false);

        ImageView profile = (ImageView) rootView.findViewById(R.id.ivProfile);
        ImageView findInstructor = (ImageView) rootView.findViewById(R.id.ivFindInstructor);
        ImageView progress = (ImageView) rootView.findViewById(R.id.ivProgress);
        ImageView workOutLog = (ImageView) rootView.findViewById(R.id.ivWorkOutLog);
        ImageView startUp = (ImageView) rootView.findViewById(R.id.ivStartUp);
        ImageView leaderBoard = (ImageView) rootView.findViewById(R.id.ivLeaderBoard);
        ImageView videos = (ImageView) rootView.findViewById(R.id.ivVideos);
        ImageView challenges = (ImageView) rootView.findViewById(R.id.ivChallenges);
        videos.setOnClickListener(this);
        challenges.setOnClickListener(this);
        leaderBoard.setOnClickListener(this);
        startUp.setOnClickListener(this);
        workOutLog.setOnClickListener(this);
        progress.setOnClickListener(this);
        findInstructor.setOnClickListener(this);
        profile.setOnClickListener(this);
        return rootView;
    }

    public void setParent(HomeAcitvity home){
        homeAcitvity = home;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.ivProfile:homeAcitvity.switchFragmentHome(1);
                break;
            case R.id.ivFindInstructor:homeAcitvity.switchFragmentHome(2);
                break;
            case R.id.ivProgress:homeAcitvity.switchFragmentHome(3);
                break;
            case R.id.ivWorkOutLog:homeAcitvity.switchFragmentHome(4);
                break;
            case R.id.ivStartUp:homeAcitvity.switchFragmentHome(5);
                break;
            case R.id.ivLeaderBoard:homeAcitvity.switchFragmentHome(6);
                break;
            case R.id.ivVideos:homeAcitvity.switchFragmentHome(7);
                break;
            case R.id.ivChallenges:homeAcitvity.switchFragmentHome(8);
                break;
        }
    }
}
