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
public class ThirdScreen extends Fragment implements View.OnClickListener {


    private MainActivity mainActivity;

    public ThirdScreen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_third_screen, container, false);
        Button back = (Button) rootView.findViewById(R.id.btnBack);
        Button submit = (Button) rootView.findViewById(R.id.btnSubmit);

        back.setOnClickListener(this);
        submit.setOnClickListener(this);
        return rootView;
    }

    public void setParent(MainActivity main){
        mainActivity = main;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnBack:
                mainActivity.switchFragments(2);
                break;
            case R.id.btnSubmit:
                break;

        }
    }
}
