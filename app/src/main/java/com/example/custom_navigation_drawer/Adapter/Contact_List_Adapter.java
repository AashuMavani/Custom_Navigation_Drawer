package com.example.custom_navigation_drawer.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.custom_navigation_drawer.Fragment.Contact_Fragment;
import com.example.custom_navigation_drawer.R;

public class Contact_List_Adapter extends BaseAdapter {
    Contact_Fragment contact_fragment;
    String name1[]={"Dhyey","Dhyana","Angle","Mansvi","Nirmal","Aman","Dhruv","Harekrishna","Mahir","Namr","Swra","Rahul"};
    String subtitle[]={"9825556734","9943526725","9745624356","7654334256","9745624356","9745624356",
            "9745624356","9745624356","9745624356","9745624356","9745624356","9745624356"};
    int img1[]={R.drawable.d,R.drawable.d,R.drawable.a,R.drawable.m,R.drawable.n,R.drawable.a,
            R.drawable.d,R.drawable.h,R.drawable.m,R.drawable.n,R.drawable.s,R.drawable.r};

    public Contact_List_Adapter(Contact_Fragment contact_fragment) {
        this.contact_fragment=contact_fragment;
    }

    @Override
    public int getCount() {
        return name1.length;
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
        view= LayoutInflater.from(contact_fragment.getContext()).inflate(R.layout.contact_listview_item,parent,false);
        ImageView imageView=view.findViewById(R.id.img);
        TextView textView=view.findViewById(R.id.name);
        TextView textView1=view.findViewById(R.id.subtitle);


        imageView.setImageResource(img1[position]);
        textView.setText(name1[position]);
        textView1.setText(subtitle[position]);
        return view;
    }
}
