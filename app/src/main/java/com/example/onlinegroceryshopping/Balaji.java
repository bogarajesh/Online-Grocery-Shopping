package com.example.onlinegroceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Balaji extends AppCompatActivity {
    LinearLayout tamato,salted,masala;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balaji);

        tamato=findViewById(R.id.Tamato);
        salted=findViewById(R.id.Salted);
        masala=findViewById(R.id.Masala);

        tamato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Balaji.this, Tamato.class);
                Toast.makeText(Balaji.this, "Tamato items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        salted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Balaji.this, Salted.class);
                Toast.makeText(Balaji.this, "Salted items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        masala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Balaji.this, Masala.class);
                Toast.makeText(Balaji.this, "Masala items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
