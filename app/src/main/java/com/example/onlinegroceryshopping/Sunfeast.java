package com.example.onlinegroceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Sunfeast extends AppCompatActivity {
    LinearLayout bounce,darkfantasy,marielight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunfeast);
        bounce=findViewById(R.id.Bounce);
        darkfantasy=findViewById(R.id.Darkfantasy);
        marielight=findViewById(R.id.Marielight);

        bounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sunfeast.this, Bounce.class);
                Toast.makeText(Sunfeast.this, "Bounce items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        darkfantasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sunfeast.this,DarkFantasy.class);
                Toast.makeText(Sunfeast.this, "DarkFantasy items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        marielight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sunfeast.this, MarieLight.class);
                Toast.makeText(Sunfeast.this, "Bounce items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
