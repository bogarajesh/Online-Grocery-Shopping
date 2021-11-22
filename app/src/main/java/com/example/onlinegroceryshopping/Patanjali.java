package com.example.onlinegroceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Patanjali extends AppCompatActivity {
    LinearLayout doodh,nariyal,buttercookies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patanjali);
        doodh=findViewById(R.id.Doodh);
        nariyal=findViewById(R.id.Nariyal);
        buttercookies=findViewById(R.id.Buttercookies);

        doodh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Patanjali.this, Doodh.class);
                Toast.makeText(Patanjali.this, "Doodh items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        nariyal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Patanjali.this,Nariyal.class);
                Toast.makeText(Patanjali.this, "Nariyal items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        buttercookies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Patanjali.this,ButterCookies.class);
                Toast.makeText(Patanjali.this, "Nariyal items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
