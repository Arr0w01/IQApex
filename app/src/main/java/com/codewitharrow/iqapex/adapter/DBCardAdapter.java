package com.codewitharrow.iqapex.adapter;

import android.content.Context;
import android.content.Intent;
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

import java.util.ArrayList;

public class DBCardAdapter extends RecyclerView.Adapter<DBCardAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<DashboardModel> mFiles;
    public DBCardAdapter(Context mContext, ArrayList<DashboardModel> mFiles)
    {
        this.mFiles = mFiles;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.db_card, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        holder.file_name.setText(mFiles.get(position).getTitle());


        if (position == 0){
            holder.dot1.setMinimumWidth(40);
            holder.dot2.setMinimumWidth(10);
            holder.dot3.setMinimumWidth(10);
            holder.dot4.setMinimumWidth(10);
        }else if (position==1){
                holder.dot1.setMinimumWidth(10);
                holder.dot2.setMinimumWidth(40);
                holder.dot3.setMinimumWidth(10);
                holder.dot4.setMinimumWidth(10);

        }else if (position==2){
            holder.dot1.setMinimumWidth(10);
            holder.dot2.setMinimumWidth(10);
            holder.dot3.setMinimumWidth(40);
            holder.dot4.setMinimumWidth(10);

        }else if (position==3){
            holder.dot1.setMinimumWidth(10);
            holder.dot2.setMinimumWidth(10);
            holder.dot3.setMinimumWidth(10);
            holder.dot4.setMinimumWidth(40);

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
        return mFiles.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        CardView dot1, dot2, dot3, dot4;
        TextView file_name ;
        ImageView album_art;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
//            file_name = itemView.findViewById(R.id.music_file_name);
//            album_art = itemView.findViewById(R.id.music_image);
            dot1 = itemView.findViewById(R.id.dot_1);
            dot2 = itemView.findViewById(R.id.dot_2);
            dot3 = itemView.findViewById(R.id.dot_3);
            dot4 = itemView.findViewById(R.id.dot_4);

        }
    }


}