package com.example.custom_navigation_drawer.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.custom_navigation_drawer.Adapter.Grid_Adapter;
import com.example.custom_navigation_drawer.R;


public class Gridview_Fragment extends Fragment {

    GridView gridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gridview_, container, false);
        gridView = view.findViewById(R.id.gridview);
        Grid_Adapter adapter = new Grid_Adapter(Gridview_Fragment.this);
        gridView.setAdapter(adapter);
        return view;
    }
}