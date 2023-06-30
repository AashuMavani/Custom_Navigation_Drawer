package com.example.custom_navigation_drawer.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.custom_navigation_drawer.Adapter.Photos_Adapter;
import com.example.custom_navigation_drawer.R;


public class Photos_Fragment extends Fragment {
  GridView photos_gridview;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_photos_, container, false);
        photos_gridview=view.findViewById(R.id.photos_gridview);
        Photos_Adapter adapter=new Photos_Adapter(Photos_Fragment.this);
        photos_gridview.setAdapter(adapter);
        return view;
    }
}