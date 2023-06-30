package com.example.custom_navigation_drawer.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.custom_navigation_drawer.Adapter.Contact_List_Adapter;
import com.example.custom_navigation_drawer.R;

public class Contact_Fragment extends Fragment {

   ListView Contact_listview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_contact_, container, false);
        Contact_listview=view.findViewById(R.id.Contact_listview);
        Contact_List_Adapter adapter=new Contact_List_Adapter(Contact_Fragment.this);
        Contact_listview.setAdapter(adapter);
        return view;
    }
}