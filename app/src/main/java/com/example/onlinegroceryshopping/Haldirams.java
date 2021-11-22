package com.example.onlinegroceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Haldirams extends AppCompatActivity {
    LinearLayout khatta,moong,murukku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haldirams);
        khatta=findViewById(R.id.Khatta);
        moong=findViewById(R.id.Moong);
        murukku=findViewById(R.id.Murukku);

        khatta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Haldirams.this, Khatta.class);
                Toast.makeText(Haldirams.this, "Khatta items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        moong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Haldirams.this, Moong.class);
                Toast.makeText(Haldirams.this, "Moong items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        murukku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Haldirams.this, Murukku.class);
                Toast.makeText(Haldirams.this, "Murukku items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
