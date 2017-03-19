package com.example.kristianfrancisco.fiture;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Acer on 19/03/2017.
 */

public class client_log_schedule_fragment extends Fragment {

    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.client_log_instructor,container,false);

        RecyclerView listView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(rootView.getContext());
        listView.setLayoutManager(layoutManager);
        adapter = new client_log_schedule_adapter();
        listView.setAdapter(adapter);
        return rootView;

    }
}
