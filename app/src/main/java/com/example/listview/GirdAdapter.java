package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class GirdAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<USB> usbList = new ArrayList<USB>();

    public GirdAdapter(Context context, int layout, List<USB> usbList) {
        this.context = context;
        this.layout = layout;
        this.usbList = usbList;
    }

    @Override
    public int getCount() {
        return usbList.size();
    }

    @Override
    public Object getItem(int i) {
        return usbList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(layout, null);

        ImageView imageView = view.findViewById(R.id.imageView);

        imageView.setImageResource(usbList.get(i).getImg());
        return view;
    }
}
