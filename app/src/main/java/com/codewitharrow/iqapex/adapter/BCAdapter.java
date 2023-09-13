package com.codewitharrow.iqapex.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaMetadataRetriever;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.codewitharrow.iqapex.R;
import com.codewitharrow.iqapex.models.BCModel;
import com.codewitharrow.iqapex.models.DashboardModel;
import com.codewitharrow.iqapex.models.TopicsModel;

import java.util.ArrayList;

public class BCAdapter extends RecyclerView.Adapter<BCAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<BCModel> list;
    public BCAdapter(Context mContext, ArrayList<BCModel> list)
    {
        this.list = list;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.bc_deatails_layout, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        holder.file_name.setText(mFiles.get(position).getTitle());


        holder.name.setText(list.get(position).getName());
        holder.price.setText(list.get(position).getLastPrice());
        holder.gain.setText(list.get(position).getGain());

        if(list.get(position).getGain().contains("-")){
            holder.gain_card.setBackgroundColor(Color.RED);
            holder.gain_card.setRadius(5);
        }




        //  holder.album_art.setAdjustViewBounds(true);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView name, price, gain;
         CardView gain_card;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
//
            name = itemView.findViewById(R.id.bc_name_tv);
            price  = itemView.findViewById(R.id.bc_price_tv);
            gain = itemView.findViewById(R.id.bc_gain_tv);
            gain_card = itemView.findViewById(R.id.bc_gain_card);


        }
    }


}