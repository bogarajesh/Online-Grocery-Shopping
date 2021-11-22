package com.example.onlinegroceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Gopal extends AppCompatActivity {
    LinearLayout cup,sev,mix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gopal);

        cup=findViewById(R.id.Cup);
        sev=findViewById(R.id.Sev);
        mix=findViewById(R.id.Mix);

        cup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Gopal.this, Cups.class);
                Toast.makeText(Gopal.this, "Cups items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        sev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Gopal.this, Sev.class);
                Toast.makeText(Gopal.this, "Sev items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        mix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Gopal.this, Mix.class);
                Toast.makeText(Gopal.this, "Mix items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
