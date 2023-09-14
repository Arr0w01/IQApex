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

public class TransactionsAdapter extends RecyclerView.Adapter<TransactionsAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<BCModel> list;
    public TransactionsAdapter(Context mContext, ArrayList<BCModel> list)
    {
        this.list = list;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.transaction_card, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        holder.file_name.setText(mFiles.get(position).getTitle());


        holder.name.setText(list.get(position).getName());
        holder.price.setText(list.get(position).getLastPrice());
        holder.gain.setText(list.get(position).getGain());

        if(list.get(position).getGain().contains("-")){
            holder.graph.setBackgroundResource(R.drawable.loss);
            holder.gain.setTextColor(Color.RED);
        }else {
            holder.graph.setBackgroundResource(R.drawable.growth);
        }

        if (list.get(position).getName().equals("BTC")){
            holder.logo.setBackgroundResource(R.drawable.bitcoin);
        } else if (list.get(position).getName().equals("ETH")) {
            holder.logo.setBackgroundResource(R.drawable.ethereum);
        }
        else if (list.get(position).getName().equals("BNB")) {
            holder.logo.setBackgroundResource(R.drawable.bnb);
        }
        else if (list.get(position).getName().equals("CYBER")) {
            holder.logo.setBackgroundResource(R.drawable.cyber);
        }
        else if (list.get(position).getName().equals("DOGE")) {
            holder.logo.setBackgroundResource(R.drawable.doge);
        }
        else if (list.get(position).getName().equals("LTC")) {
            holder.logo.setBackgroundResource(R.drawable.ltc);
        }
        else if (list.get(position).getName().equals("MATIC")) {
            holder.logo.setBackgroundResource(R.drawable.matic);
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
        ImageView logo,graph;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
//
            name = itemView.findViewById(R.id.transaction_name);
            price  = itemView.findViewById(R.id.transaction_value);
            gain = itemView.findViewById(R.id.transaction_growth);

            logo = itemView.findViewById(R.id.transaction_icon);
            graph = itemView.findViewById(R.id.transaction_graph);


        }
    }


}