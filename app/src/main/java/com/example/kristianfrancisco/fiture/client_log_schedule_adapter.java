package com.example.kristianfrancisco.fiture;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Acer on 19/03/2017.
 */

public class client_log_schedule_adapter extends RecyclerView.Adapter<client_log_schedule_adapter.ViewHolder> {

    private String[] dateAndTime = {
        "Thu, October 21",
            "",
            "",
            "",
            "Fri, October 22",
            "",
            "",
            "",
            ""
    };

    private String[] timez = {
            "1:00pm",
            "2:00pm",
            "3:00pm",
            "5:30pm",
            "11:00pm",
            "12:00pm",
            "2:00pm",
            "3:00pm",
            "5:30pm"
    };

    private String[] namez = {
            "Shawn Erl Sala",
            "Cognac Castor",
            "1 hr available",
            "Hannah Lim",
            "Edward Thomas",
            "Sean Collins",
            "2 hrs available",
            "Nancy Taylor",
            "Richard Hall"
    };

    @Override
    public client_log_schedule_adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.client_log_schedule_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(client_log_schedule_adapter.ViewHolder holder, int position) {
        holder.date_time.setText(dateAndTime[position]);
        holder.time.setText(timez[position]);
        holder.sched_client_name.setText(namez[position]);
    }

    @Override
    public int getItemCount() {
        return namez.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView date_time,sched_client_name,sched_client_char2,time;

        public ViewHolder(View rootView){
            super(rootView);
            date_time = (TextView) rootView.findViewById(R.id.date_and_time);
            time = (TextView) rootView.findViewById(R.id.time);
            sched_client_name = (TextView) rootView.findViewById(R.id.sched_client_name);
            sched_client_char2 = (TextView) rootView.findViewById(R.id.sched_client_char2);
        }

    }
}
