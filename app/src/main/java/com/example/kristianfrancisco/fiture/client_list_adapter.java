package com.example.kristianfrancisco.fiture;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Hannah on 3/19/2017.
 */

public class client_list_adapter extends RecyclerView.Adapter<client_list_adapter.ViewHolder> {
 private String[] name = {"Hannah Lim",
         "Shawn Erl Sala",
         "Deceree Clyde",
         "Charles Cruz",
         "Kristan Franciso",
         "Mycoh Basilan",
         "Cognac Castor"};
    private String[] message = {"was doing push-ups",
        "was doing curl-ups",
        "was doing jumping jacks",
        "was doing bench press",
        "was doing weight lifting",
        "was doing curl-ups"};

    private int[] images = {
            R.drawable.ateimg,
            R.drawable.hannahimg,
            R.drawable.kuyaimg,
            R.drawable.mycohimg,
            R.drawable.selenaimg,
            R.drawable.shawnimg};

    @Override
    public client_list_adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.inside_client_logs_instructor,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(client_list_adapter.ViewHolder holder, int position) {
        holder.clientImage.setImageResource(images[position]);
        holder.clientName.setText(name[position]);
        holder.clientActivity.setText(message[position]);
    }

    @Override
    public int getItemCount() { return message.length;}

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView clientImage;
        TextView clientName, clientActivity;

        public ViewHolder(View itemView){
            super(itemView);
            clientImage = (ImageView) itemView.findViewById(R.id.client_picture);
            clientName = (TextView) itemView.findViewById(R.id.client_name);
            clientActivity = (TextView) itemView.findViewById(R.id.client_activity);

        }
    }
}
