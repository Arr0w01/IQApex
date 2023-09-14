package com.codewitharrow.iqapex.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codewitharrow.iqapex.R;
import com.codewitharrow.iqapex.adapter.AssetAdapter;
import com.codewitharrow.iqapex.adapter.BCAdapter;
import com.codewitharrow.iqapex.adapter.DBCardAdapter;
import com.codewitharrow.iqapex.adapter.TopicsAdapter;
import com.codewitharrow.iqapex.models.BCModel;
import com.codewitharrow.iqapex.models.DashboardModel;
import com.codewitharrow.iqapex.models.TopicsModel;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

RecyclerView dbRV, topicsRV, bcRV, assetRV;
ArrayList<DashboardModel> dbModel;
ArrayList<TopicsModel> topicsModel;
ArrayList<BCModel> bcModel, assetModel;

DBCardAdapter dbAdapter;
TopicsAdapter topicAdapter;
BCAdapter bcAdapter;
AssetAdapter assetAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        dbRV = view.findViewById(R.id.db_card_rv);
            dbSlider();
            topicsRV = view.findViewById(R.id.option_rv);
            topicsSlider();
            bcRV = view.findViewById(R.id.trending_rv);
            bc_details();
            assetRV = view.findViewById(R.id.asset_rv);
            assetSlider();

        return view;

    }

    private void dbSlider(){
        dbModel = new ArrayList<DashboardModel>();
        dbModel.add(new DashboardModel("",""));
        dbModel.add(new DashboardModel("",""));

        dbAdapter = new DBCardAdapter(getContext(),dbModel);
        dbRV.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        dbRV.setAdapter(dbAdapter);
    }

    private void topicsSlider(){
        topicsModel = new ArrayList<>();
        topicsModel.add(new TopicsModel("Favourites"));
        topicsModel.add(new TopicsModel("Hot"));
        topicsModel.add(new TopicsModel("Gainer"));
        topicsModel.add(new TopicsModel("Loser"));
        topicsModel.add(new TopicsModel("New Listings"));

        topicAdapter = new TopicsAdapter(getContext(), topicsModel);
        topicsRV.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        topicsRV.setAdapter(topicAdapter);
    }

    private void bc_details(){
        bcModel = new ArrayList<>();
        bcModel.add(new BCModel("BNB","225.4","+3.14%"));
        bcModel.add(new BCModel("BTC","27,470.5","+5.75%"));
        bcModel.add(new BCModel("ETH","1718.7","-4.38%"));
        bcModel.add(new BCModel("SEI","0.15","+29.09%"));

        bcAdapter = new BCAdapter(getContext(), bcModel);
        bcRV.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        bcRV.setAdapter(bcAdapter);
    }

    private void assetSlider(){
        assetModel = new ArrayList<>();
        assetModel.add(new BCModel("Bitcoin","$6012.00","+2.17%"));
        assetModel.add(new BCModel("Etherium","$4012","-1.17%"));
        assetModel.add(new BCModel("Ripple","$3429.00","-2.17%"));

        assetAdapter = new AssetAdapter(getContext(), assetModel);
        assetRV.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        assetRV.setAdapter(assetAdapter);
    }
}