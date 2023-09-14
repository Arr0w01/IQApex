package com.codewitharrow.iqapex.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codewitharrow.iqapex.R;
import com.codewitharrow.iqapex.adapter.TransactionsAdapter;
import com.codewitharrow.iqapex.models.BCModel;

import java.util.ArrayList;


public class TransactionFragment extends Fragment {

    RecyclerView transactionRV;
    TransactionsAdapter adapter;
    ArrayList<BCModel> bcModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_transaction, container, false);

        transactionRV = view.findViewById(R.id.transaction_rv);
        fetchRV();
        return  view;
    }

    private void fetchRV(){
        bcModel = new ArrayList<>();
        bcModel.add(new BCModel("BTC","$27,249","+30.58%"));
        bcModel.add(new BCModel("ETH","$1706.20","-12.72%"));
        bcModel.add(new BCModel("BNB","$223.4","-5.72%"));
        bcModel.add(new BCModel("CYBER","$7.686","+10.58%"));
        bcModel.add(new BCModel("DOGE","$0.06502","+12.78%"));
        bcModel.add(new BCModel("LTC","$67.12","+5.90%"));
        bcModel.add(new BCModel("MATIC","$0.5715","-10.21%"));

        adapter = new TransactionsAdapter(getContext(), bcModel);

        transactionRV.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        transactionRV.setAdapter(adapter);
    }
}