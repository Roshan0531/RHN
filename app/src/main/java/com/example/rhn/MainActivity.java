package com.example.rhn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
   ImageButton imgButton1;//login button
    ImageButton imgButton2;// accounting button
    ImageButton imgButton3;// career button
    ImageButton imgButton4;// designer button
    ImageButton imgButton5;// engineer button
    ImageButton imgButton6;// investor button
    ImageButton imgButton7;// projects button
    ImageButton imgButton8;// supplier button
    ImageButton imgButton9;// setting button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       imgButton1 =  findViewById(R.id.login);
       imgButton2 =  findViewById(R.id.accounting);
       imgButton3 =  findViewById(R.id.career);
       imgButton4 = findViewById(R.id.designer);
       imgButton5= findViewById(R.id.engineer);
       imgButton6 = findViewById(R.id.investors);
       imgButton7 = findViewById(R.id.projects);
        imgButton8 = findViewById(R.id.supplier);
        imgButton9 = findViewById(R.id.setting);


        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,login.class);
                startActivity(intent); }
            });
        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent= new Intent(MainActivity.this,Accounting.class);
                    startActivity(intent); }
        });
        imgButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,career.class);
                startActivity(intent); }
        });
        imgButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,designer.class);
                startActivity(intent); }
        });
        imgButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,engineer.class);
                startActivity(intent); }
        });
        imgButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,investors.class);
                startActivity(intent); }
        });
        imgButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,projects.class);
                startActivity(intent); }
        });
        imgButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,supplier.class);
                startActivity(intent); }
        });
        imgButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,setting.class);
                startActivity(intent); }
        });
}
}