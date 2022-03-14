package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Main_ListView extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view);

        listView=findViewById(R.id.listview);
        UserAC tai=new UserAC("Tai",18);
        UserAC thanh=new UserAC("trong",18);
        UserAC trong=new UserAC("thanh",18);
        UserAC [] user= new UserAC[]{tai,thanh,trong};
        ArrayAdapter<UserAC> arrayAdapter
                = new ArrayAdapter<UserAC>(this, android.R.layout.simple_list_item_1 , user);
        listView.setAdapter(arrayAdapter);

    }
}