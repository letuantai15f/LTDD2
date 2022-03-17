package com.example.myapplication;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BaiTap5 extends AppCompatActivity {
    private ListView listView;
    private ArrayList<itemsCake> itemsArrayList;
    private ArrayAdapterCAKE arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap5);

        EditText editText=findViewById(R.id.timcake);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                ArrayList<itemsCake> filter=new ArrayList<>();
                for(itemsCake itemsCake:itemsArrayList){
                    if(itemsCake.getTen().toLowerCase().contains(editable.toString().toLowerCase())){
                        filter.add(itemsCake);
                    }
                }
                arrayAdapter.filterList(filter);
            }
        });

        listView=findViewById(R.id.list_cake);
        itemsArrayList=new ArrayList<>();
        int tasy= R.drawable.donutmot;
        int yellow=R.drawable.donutyellow;
        int green=R.drawable.greendonut;
        itemsCake donutmot=new itemsCake(tasy,"Tasty Donut","Spicy tasty donut family","$10.00");
        itemsCake donut2=new itemsCake(yellow,"Yellow Donut","Spicy tasty donut family","$20.00");
        itemsCake donut3=new itemsCake(green,"Green Donut","Spicy tasty donut family","$30.00");
        itemsArrayList.add(donutmot);
        itemsArrayList.add(donut2);
        itemsArrayList.add(donut3);
         arrayAdapter=  new ArrayAdapterCAKE(this,R.layout.item_list,itemsArrayList);
        listView.setAdapter(arrayAdapter);

    }

}