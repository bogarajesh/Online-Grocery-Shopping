package com.example.onlinegroceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ParleG extends AppCompatActivity {
    Button btnaddcart;
    EditText t1,t2;
    TextView providee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parle_g);
        btnaddcart = findViewById(R.id.AddCart1);
        t1=findViewById(R.id.Price);
        t2=findViewById(R.id.Quantity);
        providee=findViewById(R.id.Provide);

        btnaddcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String data=t1.getText().toString();
                String data1=t2.getText().toString();
                Intent i = new Intent(ParleG.this, AddCart.class);
                i.putExtra("data",data);
                i.putExtra("data1",data1);
                Toast.makeText(ParleG.this, "Added", Toast.LENGTH_SHORT).show();
                startActivity(i);


            }
        });
    }
}
