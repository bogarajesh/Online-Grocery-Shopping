package com.example.onlinegroceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnlogin,btnsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin =findViewById(R.id.button_Login);
        btnsignup=findViewById(R.id.button_Signup);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Login_page.class);
                Toast.makeText(MainActivity.this,"PLEASE LOGIN HERE",Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Signup_page.class);
                Toast.makeText(MainActivity.this, "PLEASE SIGN-UP HERE", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

    }
}
