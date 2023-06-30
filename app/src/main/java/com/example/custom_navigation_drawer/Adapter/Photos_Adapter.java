package com.example.custom_navigation_drawer.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.custom_navigation_drawer.Fragment.Photos_Fragment;
import com.example.custom_navigation_drawer.R;

public class Photos_Adapter extends BaseAdapter {
    Photos_Fragment photos_fragment;
    int []images={R.drawable.bueger,R.drawable.chainez_bhel,R.drawable.garlic_bread,R.drawable.pav_bhaji,
                  R.drawable.sandwich,R.drawable.sevpuri,R.drawable.sizzler};
    public Photos_Adapter(Photos_Fragment photos_fragment) {
        this.photos_fragment=photos_fragment;
    }

    @Override
    public int getCount() {
        return images.length;
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
        view= LayoutInflater.from(photos_fragment.getContext()).inflate(R.layout.photos_gridview_item,parent,false);
        ImageView imageView=view.findViewById(R.id.photos_gridview_item);
        imageView.setImageResource(images[position]);
        return view;
    }
}
