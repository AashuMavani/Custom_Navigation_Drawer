package com.example.custom_navigation_drawer.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.custom_navigation_drawer.Fragment.Listview_Fragment;
import com.example.custom_navigation_drawer.R;

public class Listview_Adapter extends BaseAdapter {
    Listview_Fragment listview_fragment;
    String []name={"one","two","three","four","five","six","seven","eight","nine","ten"};
    public Listview_Adapter(Listview_Fragment listview_fragment) {
        this.listview_fragment=listview_fragment;

    }

    @Override
    public int getCount() {

        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view= LayoutInflater.from(listview_fragment.getContext()).inflate(R.layout.list_view_item,parent,false);
        TextView textView=view.findViewById(R.id.text);
        textView.setText(name[position]);
        return view;
    }
}
