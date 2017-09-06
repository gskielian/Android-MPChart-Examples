package com.dastechlabs.sensordashboard;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class Example1LineChart extends AppCompatActivity {

    private LineChart chart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example1_line_chart);


        // instantiate chart
        chart = findViewById(R.id.line_chart);

        List<Entry> entries = new ArrayList<Entry>();


        // adding data points to the entry list
        for (int i = 0; i < 10; i++) {
            entries.add(new Entry(i,i*i));
        }

        // stylization
        LineDataSet dataSet = new LineDataSet(entries, "Label");
        dataSet.setColor(Color.GREEN);
        dataSet.setValueTextColor(Color.RED);

        // updating data and refreshing
        LineData lineData = new LineData(dataSet);
        chart.setData(lineData);
        chart.invalidate(); // refresh
    }
}
