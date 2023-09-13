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
import com.codewitharrow.iqapex.models.DashboardModel;
import com.codewitharrow.iqapex.models.TopicsModel;

import java.util.ArrayList;

public class TopicsAdapter extends RecyclerView.Adapter<TopicsAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<TopicsModel> list;
    public TopicsAdapter(Context mContext, ArrayList<TopicsModel> list)
    {
        this.list = list;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.trend_topics_layout, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        holder.file_name.setText(mFiles.get(position).getTitle());


          holder.title.setText(list.get(position).getTitle());





        //  holder.album_art.setAdjustViewBounds(true);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    holder.itemView.setBackgroundColor(Color.GRAY);
            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView title;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
//
            title = itemView.findViewById(R.id.topics_tv);

        }
    }


}