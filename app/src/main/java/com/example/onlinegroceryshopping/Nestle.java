package com.example.onlinegroceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Nestle extends AppCompatActivity {
    LinearLayout kitkat,munch,crunch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nestle);
        kitkat=findViewById(R.id.Kitkat);
        munch=findViewById(R.id.Munch);
        crunch=findViewById(R.id.Crunch);

        kitkat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Nestle.this, KitKat.class);
                Toast.makeText(Nestle.this, "KitKat items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        munch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Nestle.this, Munch.class);
                Toast.makeText(Nestle.this, "Munch items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        crunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Nestle.this, Crunch.class);
                Toast.makeText(Nestle.this, "Crunch items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
