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
public class SecondScreen extends Fragment implements View.OnClickListener {


    private MainActivity mainActivity;

    public SecondScreen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_second_screen, container, false);

        Button home = (Button) rootView.findViewById(R.id.btnHome);
        Button signup = (Button) rootView.findViewById(R.id.btnSignUp);
        Button login = (Button) rootView.findViewById(R.id.btnLogin);
        login.setOnClickListener(this);
        home.setOnClickListener(this);
        signup.setOnClickListener(this);

        return rootView;
    }

    public void setParent (MainActivity main){

        mainActivity = main;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnHome: mainActivity.switchFragments(1);
                break;
            case R.id.btnSignUp:mainActivity.switchFragments(3);
                break;
            case R.id.btnLogin:mainActivity.switchFragments(4);
                break;

        }
    }
}
