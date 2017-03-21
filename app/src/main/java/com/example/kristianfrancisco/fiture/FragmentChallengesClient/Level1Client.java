package com.example.kristianfrancisco.fiture.FragmentChallengesClient;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kristianfrancisco.fiture.HomeAcitvity;
import com.example.kristianfrancisco.fiture.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Level1Client extends Fragment {


    HomeAcitvity hm;
    public Level1Client() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_level1_client, container, false);


        return view;
    }
    public void setParent(HomeAcitvity hm){
        this.hm = hm;
    }

}
