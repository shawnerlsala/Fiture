package com.example.kristianfrancisco.fiture;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class findInstructor extends DialogFragment {

ImageView image;
    public findInstructor() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_find_instructor, container, false);

        image = (ImageView)view.findViewById(R.id.shawnPic);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                InstructorProfile pr = new InstructorProfile();
                dismiss();
                pr.show(fm,"Instructor");
            }
        });

        return view;
    }

}
