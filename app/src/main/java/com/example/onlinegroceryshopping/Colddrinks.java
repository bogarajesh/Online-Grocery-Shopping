package com.example.onlinegroceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Colddrinks extends AppCompatActivity {
    LinearLayout thumbsup,sprite,fizz,frooti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colddrinks);

        thumbsup=findViewById(R.id.Thumbsup);
        sprite=findViewById(R.id.Sprite);
        fizz=findViewById(R.id.Fizz);
        frooti=findViewById(R.id.Frooti);

        thumbsup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Colddrinks.this, Thumbsup.class);
                Toast.makeText(Colddrinks.this, "Thumbsup items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        sprite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Colddrinks.this, Sprite.class);
                Toast.makeText(Colddrinks.this, "Sprite items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        fizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Colddrinks.this, Fizz.class);
                Toast.makeText(Colddrinks.this, "Fizz items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        frooti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Colddrinks.this, Frooti.class);
                Toast.makeText(Colddrinks.this, "Frooti items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
