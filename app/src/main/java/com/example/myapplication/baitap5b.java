package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class baitap5b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baitap5b);
        Bundle bundle=getIntent().getExtras();
        if(bundle==null){
            return;
        }
            itemsCake itemsCake= (com.example.myapplication.itemsCake) bundle.get("Obj");
        ImageView imageView=    findViewById(R.id.img2);
        imageView.setImageResource(itemsCake.getId());
        TextView textView1=findViewById(R.id.txttencake2);
        textView1.setText(itemsCake.getTen());
        TextView textView2=findViewById(R.id.txtmota2);
        textView2.setText(itemsCake.getMota());
        TextView textView3=findViewById(R.id.txtgia2);
        textView3.setText(itemsCake.getGiatien());
    }
}