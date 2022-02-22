package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityT2 extends AppCompatActivity {
    Button button;
    EditText editText,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_t2);
        button=findViewById(R.id.btnlogin);
        editText=findViewById(R.id.txtname);
        editText2=findViewById(R.id.txtpass);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText2.getText().length()==0 ||editText.getText().length()==0){
                    Toast.makeText(MainActivityT2.this, "Vui long khong de trong", Toast.LENGTH_SHORT).show();
                }
                if(editText.getText().equals("admin") && editText2.getText().equals("admin")){
                    Toast.makeText(MainActivityT2.this, "Login thanh cong", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(MainActivityT2.this, "Thong tin khong dung", Toast.LENGTH_SHORT).show();
            }
        });
    }
}