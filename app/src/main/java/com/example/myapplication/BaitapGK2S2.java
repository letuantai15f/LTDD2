package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BaitapGK2S2 extends AppCompatActivity {
    ListView listView;
    private ArrayList<itemsCake> cakeArrayList;
    private ArrayAdapterCAKE arrayAdapterGK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baitap_gk2_s2);
        listView=findViewById(R.id.listgk);
        cakeArrayList=new ArrayList<>();
        int tasy= R.drawable.donutmot;
        int yellow=R.drawable.donutyellow;
        int green=R.drawable.greendonut;
        itemsCake donutmot=new itemsCake(tasy,"Tasty Donut","Spicy tasty donut family","$10.00");
        itemsCake donut2=new itemsCake(yellow,"Yellow Donut","Spicy tasty donut family","$20.00");
        itemsCake donut3=new itemsCake(green,"Green Donut","Spicy tasty donut family","$30.00");
        cakeArrayList.add(donut2);
        cakeArrayList.add(donutmot);
        cakeArrayList.add(donut3);
        arrayAdapterGK=new ArrayAdapterCAKE(this,R.layout.item_cake,cakeArrayList);


    }
}