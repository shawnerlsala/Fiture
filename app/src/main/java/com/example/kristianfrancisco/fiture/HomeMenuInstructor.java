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
public class HomeMenuInstructor extends Fragment implements View.OnClickListener {

    private HomActivityInstructor homActivityInstructor;

    public HomeMenuInstructor() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home_menu_instructor, container, false);

        ImageView attendance = (ImageView) rootView.findViewById(R.id.ivAttendance);
        ImageView clientLogs = (ImageView) rootView.findViewById(R.id.ivClientLogs);
        ImageView schedule = (ImageView) rootView.findViewById(R.id.ivSchedule);
        ImageView clientsAttendance = (ImageView) rootView.findViewById(R.id.ivClientAttendance);
        ImageView profileInstructor = (ImageView) rootView.findViewById(R.id.ivProfileInstructor);
        ImageView logOutInstructor = (ImageView) rootView.findViewById(R.id.ivLogOutInstructor);
        ImageView fitureChallenge = (ImageView) rootView.findViewById(R.id.ivFitureChallenge);

        attendance.setOnClickListener(this);
        clientLogs.setOnClickListener(this);
        schedule.setOnClickListener(this);
        clientsAttendance.setOnClickListener(this);
        profileInstructor.setOnClickListener(this);
        logOutInstructor.setOnClickListener(this);
        fitureChallenge.setOnClickListener(this);

        return rootView;
    }

    public void setParent(HomActivityInstructor homActivityInstructor){
        this.homActivityInstructor = homActivityInstructor;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.ivAttendance:homActivityInstructor.switchFragmentsInstructor(1);
                break;
            case R.id.ivClientLogs:homActivityInstructor.switchFragmentsInstructor(2);
                break;
            case R.id.ivSchedule:homActivityInstructor.switchFragmentsInstructor(3);
                break;
            case R.id.ivClientAttendance:homActivityInstructor.switchFragmentsInstructor(4);
                break;
            case R.id.ivProfileInstructor:homActivityInstructor.switchFragmentsInstructor(5);
                break;
            case R.id.ivLogOutInstructor:homActivityInstructor.switchFragmentsInstructor(6);
                break;
            case R.id.ivFitureChallenge:homActivityInstructor.switchFragmentsInstructor(7);
                break;

        }
    }
}
