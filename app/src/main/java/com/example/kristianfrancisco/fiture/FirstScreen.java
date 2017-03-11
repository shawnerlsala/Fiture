package com.example.kristianfrancisco.fiture;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstScreen extends Fragment implements View.OnClickListener {


    private MainActivity mainActivity;

    public FirstScreen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_first_screen, container, false);

        Button client = (Button) rootView.findViewById(R.id.btnClient);
        Button instructor = (Button) rootView.findViewById(R.id.btnInstructor);

        client.setOnClickListener(this);
        instructor.setOnClickListener(this);

        return rootView;
    }

    public void setParent (MainActivity main){

        mainActivity = main;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnClient:
                mainActivity.switchFragments(2);
                mainActivity.isClient(true);
                break;

            case R.id.btnInstructor:
                mainActivity.switchFragments(2);
                mainActivity.isClient(false);
                break;

        }

    }
}
