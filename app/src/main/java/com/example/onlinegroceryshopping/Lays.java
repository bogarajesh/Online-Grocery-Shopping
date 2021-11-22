package com.example.onlinegroceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Lays extends AppCompatActivity {
    LinearLayout classic,creamonion,onion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lays);

        classic=findViewById(R.id.Classic);
        creamonion=findViewById(R.id.CreamOnion);
        onion=findViewById(R.id.Onion);

        classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Lays.this, Classic.class);
                Toast.makeText(Lays.this, "Classic items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        creamonion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Lays.this, CreamOnion.class);
                Toast.makeText(Lays.this, "CreamOnion items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        onion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Lays.this, Onion.class);
                Toast.makeText(Lays.this, "Onion items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
