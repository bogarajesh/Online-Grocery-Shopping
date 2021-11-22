package com.example.onlinegroceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Cadbury extends AppCompatActivity {
    LinearLayout dairymilk,silk,gems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadbury);

        dairymilk=findViewById(R.id.Dairymilk);
        silk=findViewById(R.id.Dairymilksilk);
        gems=findViewById(R.id.Gems);

        dairymilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cadbury.this, DairyMilk.class);
                Toast.makeText(Cadbury.this, "Dairymilk items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        silk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cadbury.this, Silk.class);
                Toast.makeText(Cadbury.this, "Dairymilksilk items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        gems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cadbury.this, Gems.class);
                Toast.makeText(Cadbury.this, "Gems items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
