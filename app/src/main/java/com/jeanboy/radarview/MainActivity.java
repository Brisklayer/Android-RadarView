package com.jeanboy.radarview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jeanboy.radarview.view.RadarData;
import com.jeanboy.radarview.view.RadarView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadarView radarView = (RadarView) findViewById(R.id.radarView);

        List<RadarData> dataList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            RadarData data = new RadarData("标题" + i, i * 11);
            dataList.add(data);
        }
        radarView.setDataList(dataList);
    }
}
