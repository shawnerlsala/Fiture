package com.example.kristianfrancisco.fiture.FragmentChallenges;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kristianfrancisco.fiture.HomActivityInstructor;
import com.example.kristianfrancisco.fiture.HomeAcitvity;
import com.example.kristianfrancisco.fiture.R;
import com.firebase.client.Firebase;


public class Level1 extends Fragment {

    HomActivityInstructor hm;
    Firebase firebase;

    public Level1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_level1, container, false);
        firebase = new Firebase("https://fitture-eaa16.firebaseio.com/level2");


        return view;
    }
    public void setParent(HomActivityInstructor hm){
        this.hm = hm;
    }


}
