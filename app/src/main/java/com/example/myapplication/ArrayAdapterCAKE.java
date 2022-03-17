package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

public class ArrayAdapterCAKE extends ArrayAdapter<itemsCake> {
    private Context context;
    private int resource;
    private ArrayList<itemsCake> itemsArrayList;


    public ArrayAdapterCAKE(Context context, int resource, ArrayList<itemsCake> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.itemsArrayList = objects;
    }

    public  void filterList(ArrayList<itemsCake> filter) {
        itemsArrayList=filter;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if(itemsArrayList.size()!=0)
            return itemsArrayList.size();
        else return 1;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.item_cake,parent,false);
        TextView tvten=convertView.findViewById(R.id.txtten);
        TextView tvmota=convertView.findViewById(R.id.txtmota);
        TextView tvgia=convertView.findViewById(R.id.txtgia);
        ImageView imghinh=convertView.findViewById(R.id.txthinh);
        itemsCake items= itemsArrayList.get(position);

       ConstraintLayout constraintLayout;
        constraintLayout = (ConstraintLayout) convertView.findViewById(R.id.layoutitemcake);

        imghinh.setImageResource(items.getId());

        tvten.setText(items.getTen());
        tvmota.setText(items.getMota());
        tvgia.setText(items.getGiatien());

    convertView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            onclickgoto5b(items);

        }
    });
        return convertView;
    }
    private  void  onclickgoto5b(itemsCake itemsCake){
        Intent intent = new Intent(context,baitap5b.class);
        Bundle bundle=new Bundle();
        bundle.putSerializable("Obj",itemsCake);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }


}
