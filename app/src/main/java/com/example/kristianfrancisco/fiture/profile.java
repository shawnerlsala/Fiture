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
public class profile extends Fragment {

    Button findInstructor;
    HomeAcitvity hm;

    public profile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

        findInstructor = (Button)rootView.findViewById(R.id.findInstructor);

        findInstructor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                hm.showDialogs(1);


            }
        });

        return rootView;
    }


    public void setParentActivity(HomeAcitvity hm){

        this.hm = hm;
    }
}
