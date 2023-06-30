package com.example.custom_navigation_drawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.custom_navigation_drawer.Fragment.Contact_Fragment;
import com.example.custom_navigation_drawer.Fragment.Gridview_Fragment;
import com.example.custom_navigation_drawer.Fragment.Listview_Fragment;
import com.example.custom_navigation_drawer.Fragment.Photos_Fragment;
import com.example.custom_navigation_drawer.Fragment.Setting_Fragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout=findViewById(R.id.Drawer_Layout);
        toolbar=findViewById(R.id.toolbar);
        navigationView=findViewById(R.id.navigation_view);


        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(MainActivity.this,drawerLayout,toolbar,R.string.Open_Drawer,R.string.Close_Drawer);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if (id==R.id.Item_Listview)
                {
                   addFragment(new Listview_Fragment());
                }
                if (id==R.id.Item_Gridview)
                {
                    addFragment(new Gridview_Fragment());
                }
                if (id==R.id.Item_Contact)
                {
                    addFragment(new Contact_Fragment());
                }
                if (id==R.id.Item_Setting)
                {
                    addFragment(new Setting_Fragment());
                }
                if (id==R.id.Item_Photos)
                {
                    addFragment(new Photos_Fragment());
                }

                drawerLayout.close();
                return true;
            }

            private void addFragment(Fragment fragment) {

                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();
                transaction.replace(R.id.contentview,fragment);
                transaction.commit();

            }
        });
    }
}