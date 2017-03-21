package com.example.kristianfrancisco.fiture;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;


/**
 * A simple {@link Fragment} subclass.
 */
public class fitureChallenge extends Fragment {
Firebase firebase;
    Firebase level1;
    Button but;
    HomActivityInstructor hm;

    public fitureChallenge() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_fiture_challenge, container, false);

        but = (Button)view.findViewById(R.id.butt);
        firebase = new Firebase("https://fitture-eaa16.firebaseio.com/ChallengeTakers");
        level1 = new Firebase("https://fitture-eaa16.firebaseio.com/Level1");
        firebase.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                but.setVisibility(View.VISIBLE);
                but.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        level1.child("level1").setValue("good");
                        hm.switchFragmentsInstructor(8);
                    }
                });
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


        return view;
    }
    public void setParent(HomActivityInstructor hm){
        this.hm = hm;
    }

}
