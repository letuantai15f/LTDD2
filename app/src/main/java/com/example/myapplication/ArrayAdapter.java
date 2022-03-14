package com.example.myapplication;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ArrayAdapter extends android.widget.ArrayAdapter <items>  {
    private Context context;
    private int resource;
    private ArrayList<items> itemsArrayList;


    public ArrayAdapter(    Context context, int resource,  ArrayList<items> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.itemsArrayList=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.item_list,parent,false);
        TextView tvName=convertView.findViewById(R.id.txtnameitem);
        TextView tvNameShop=convertView.findViewById(R.id.txtnameshop);
        ImageView imgitem=convertView.findViewById(R.id.img);
        items items= itemsArrayList.get(position);
        imgitem.setImageResource(R.drawable.book);
        int i=items.getImg();
        switch (i){
            case 1:imgitem.setImageResource(R.drawable.book);
            break;
            default:
                break;

        }
        tvName.setText(items.getName());
        tvNameShop.setText(items.getNameshop());
        return convertView;
    }
}
