package com.example.rhn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class career extends AppCompatActivity {
ImageButton imageButton1;
ImageButton imageButton2;
ImageButton imageButton3;
ImageButton imageButton4;
ImageButton imageButton5;
ImageButton imageButton6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career);
        imageButton1 =findViewById(R.id.cbt1);
        imageButton2 =findViewById(R.id.cbt2);
        imageButton3 =findViewById(R.id.cbt3);
        imageButton4 =findViewById(R.id.cbt4);
        imageButton5 =findViewById(R.id.cbt5);
        imageButton6 =findViewById(R.id.cbt6);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(career.this,Construction_work.class);
                startActivity(intent);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(career.this,solution.class);
                startActivity(intent);
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(career.this,real_estate_investment_and_development.class);
                startActivity(intent);
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(career.this,consulting_services.class);
                startActivity(intent);
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(career.this,training_and_development.class);
                startActivity(intent);
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(career.this,growers_and_Exporters.class);
                startActivity(intent);
            }
        });

    }
}
