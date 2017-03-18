package com.example.kristianfrancisco.fiture;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 * Created by Hannah on 3/19/2017.
 */

public class inside_client_logs_instructor extends Fragment {

    FrameLayout f1;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    public inside_client_logs_instructor(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.client_log_instructor,container,false);
         RecyclerView listView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(rootView.getContext());
        listView.setLayoutManager(layoutManager);
        adapter = new client_list_adapter();
        listView.setAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

}
