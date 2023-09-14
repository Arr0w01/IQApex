package com.codewitharrow.iqapex.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsWaterfall;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.ValueDataEntry;
import com.codewitharrow.iqapex.R;

import java.util.ArrayList;
import java.util.List;


public class TradeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_trade, container, false);

        AnyChartView anyChartView = view.findViewById(R.id.activity_chart);
//        anyChartView.setProgressBar(view.findViewById(R.id.progress_bar));
        ChartsWaterfall waterfall = AnyChart.waterfall();



//

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("12:00", 250));
        data.add(new ValueDataEntry("13:00", 280));
        data.add(new ValueDataEntry("14:00", -270));
        data.add(new ValueDataEntry("15:00", 240));
        data.add(new ValueDataEntry("16:00", -55));
        data.add(new ValueDataEntry("17:00", -250));
        data.add(new ValueDataEntry("18:00", 10));
        data.add(new ValueDataEntry("19:00", 15));
//        data.add(new ValueDataEntry("Aug", -1500000));
//        data.add(new ValueDataEntry("Sep", 4200000));
//        data.add(new ValueDataEntry("Oct", 5300000));
//        data.add(new ValueDataEntry("Nov", -1500000));
//        data.add(new ValueDataEntry("Dec", 5100000));
        DataEntry end = new DataEntry();
        end.setValue("x", "End");
        end.setValue("isTotal", true);
        data.add(end);

        waterfall.data(data);

        anyChartView.setChart(waterfall);

        return view;
    }
}