package com.example.onlinegroceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Parle extends AppCompatActivity {

    LinearLayout parleg,monaco,krackjack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parle);
        parleg=findViewById(R.id.Parleg);
        monaco=findViewById(R.id.monaco);
        krackjack=findViewById(R.id.krackjack);

        parleg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Parle.this, ParleG.class);
                Toast.makeText(Parle.this, "Parle items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        monaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Parle.this, Monaco.class);
                Toast.makeText(Parle.this, "Monaco items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        krackjack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Parle.this, Krackjack.class);
                Toast.makeText(Parle.this, "Krackjack items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
