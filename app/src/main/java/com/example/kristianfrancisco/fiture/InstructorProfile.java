package com.example.kristianfrancisco.fiture;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class InstructorProfile extends DialogFragment {
Button select;
    private HomeAcitvity hm;

    public InstructorProfile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_instructor_profile, container, false);
        select = (Button)view.findViewById(R.id.ok);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),startUpActivity.class));
                hm.finish();
            }
        });

        return view;
    }

    public void setParentActivity(HomeAcitvity hm){
        this.hm = hm;

    }

}
