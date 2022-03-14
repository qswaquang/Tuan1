package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ActionBar;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.grid_view);

        List<USB> usbList = new ArrayList<USB>();
        usbList.add(new USB(R.drawable.daucam));
        usbList.add(new USB(R.drawable.carbusbtops2));
        usbList.add(new USB(R.drawable.dauchuyendoi));
        usbList.add(new USB(R.drawable.dauchuyendoipsps2));
        usbList.add(new USB(R.drawable.daynguon));
        usbList.add(new USB(R.drawable.giacchuyen));

        gridView.setAdapter(new GirdAdapter(this, R.layout.grid_item, usbList));
    }
}