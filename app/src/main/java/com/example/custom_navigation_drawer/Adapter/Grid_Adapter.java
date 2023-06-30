package com.example.custom_navigation_drawer.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.custom_navigation_drawer.Fragment.Gridview_Fragment;
import com.example.custom_navigation_drawer.R;

public class Grid_Adapter extends BaseAdapter {
    Gridview_Fragment gridview_fragment;
    int[]img2={R.drawable.cherryblossom,R.drawable.hollyhocks,R.drawable.lotus,R.drawable.plumeria,
            R.drawable.orchid,R.drawable.rose,R.drawable.tulip,R.drawable.cherryblossom,R.drawable.hollyhocks,R.drawable.lotus,R.drawable.plumeria,
            R.drawable.orchid,R.drawable.rose,R.drawable.tulip };
    public Grid_Adapter(Gridview_Fragment gridview_fragment) {
        this.gridview_fragment=gridview_fragment;

    }

    @Override
    public int getCount() {
        return img2.length;
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
        view= LayoutInflater.from(gridview_fragment.getContext()).inflate(R.layout.gridview_item,parent,false);
        ImageView imageView=view.findViewById(R.id.Gridview_item);
        imageView.setImageResource(img2[position]);
        return view;
    }
}
