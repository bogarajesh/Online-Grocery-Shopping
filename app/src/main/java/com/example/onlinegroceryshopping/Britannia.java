package com.example.onlinegroceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Britannia extends AppCompatActivity {
    LinearLayout goodday,bourbon,vitamarie,nutrichoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_britannia);
        goodday=findViewById(R.id.goodday);
        bourbon=findViewById(R.id.Bourbon);
        vitamarie=findViewById(R.id.Vitamariegold);
        nutrichoice=findViewById(R.id.Nutrichoice);

        goodday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Britannia.this, GoodDay.class);
                Toast.makeText(Britannia.this, "GoodDay items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        bourbon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Britannia.this,Bourbon.class);
                Toast.makeText(Britannia.this, "Bourbon items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        vitamarie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Britannia.this, VitaMarie.class);
                Toast.makeText(Britannia.this, "VitaMarie items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        nutrichoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Britannia.this,Nutrichoice.class);
                Toast.makeText(Britannia.this, "Nutrichoice items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
