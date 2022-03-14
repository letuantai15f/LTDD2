package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main_CustomList extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_custom_list);
        listView=findViewById(R.id.customlist);
        ArrayList<items> itemsArrayList=new ArrayList<>();
        items book=new items(1,"Sach","Tai");
        itemsArrayList.add(book);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.item_list,itemsArrayList);
        listView.setAdapter(arrayAdapter);
    }

}