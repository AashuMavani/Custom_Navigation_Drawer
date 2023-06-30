package com.example.custom_navigation_drawer.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.custom_navigation_drawer.Adapter.Listview_Adapter;
import com.example.custom_navigation_drawer.R;


public class Listview_Fragment extends Fragment {
    ListView listview;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_listview_, container, false);
        listview=view.findViewById(R.id.listview);
        Listview_Adapter adapter = new Listview_Adapter(Listview_Fragment.this);
        listview.setAdapter(adapter);
        return view;
    }
}