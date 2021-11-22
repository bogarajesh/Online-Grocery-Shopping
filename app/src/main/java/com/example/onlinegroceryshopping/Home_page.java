package com.example.onlinegroceryshopping;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class Home_page extends AppCompatActivity {

    LinearLayout llparle,llbritannia,llsunfeast,llpatanjali,llcadbury,llnestle,llgopal,llbalaji,lllays,llhaldirams,llcolddrinks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        llparle=findViewById(R.id.Parle);
        llbritannia=findViewById(R.id.Britannia);
        llsunfeast=findViewById(R.id.Sunfeast);
        llpatanjali=findViewById(R.id.Patanjali);
        llcadbury=findViewById(R.id.cadbury);
        llnestle=findViewById(R.id.Nestle);
        llgopal=findViewById(R.id.Gopal);
        llbalaji=findViewById(R.id.Balaji);
        llhaldirams=findViewById(R.id.Halidrams);
        lllays=findViewById(R.id.Lays);
        llcolddrinks=findViewById(R.id.colddrinks);


        llparle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home_page.this, Parle.class);
                Toast.makeText(Home_page.this, "Parle items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        llbritannia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home_page.this, Britannia.class);
                Toast.makeText(Home_page.this, "Britannia items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        llsunfeast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home_page.this, Sunfeast.class);
                Toast.makeText(Home_page.this, "Sunfeast items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        llpatanjali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home_page.this, Patanjali.class);
                Toast.makeText(Home_page.this, "Patanjali items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        llcadbury.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home_page.this, Cadbury.class);
                Toast.makeText(Home_page.this, "Cadbury items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        llnestle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home_page.this, Nestle.class);
                Toast.makeText(Home_page.this, "Nestle items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        llbalaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home_page.this, Balaji.class);
                Toast.makeText(Home_page.this, "Balaji items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        lllays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home_page.this, Lays.class);
                Toast.makeText(Home_page.this, "Lays items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        llgopal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home_page.this, Gopal.class);
                Toast.makeText(Home_page.this, "Gopal items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        llhaldirams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home_page.this, Haldirams.class);
                Toast.makeText(Home_page.this, "Haldirams items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        llcolddrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home_page.this, Colddrinks.class);
                Toast.makeText(Home_page.this, "Colddrinks items", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.Logout:
                Intent i = new Intent(Home_page.this, MainActivity.class);
                startActivity(i);
                Toast.makeText(this,"Logout...!!",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Search:
                Toast.makeText(this,"Search",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.ShoppingCart:
                Intent j = new Intent(Home_page.this, AddCart.class);
                startActivity(j);
                Toast.makeText(this,"Added..",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Profile:
                Intent intent = new Intent(Home_page.this, Profile.class);
                startActivity(intent);
                Toast.makeText(this,"Profile..",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Setting:
                Toast.makeText(this,"Setting..",Toast.LENGTH_SHORT).show();
                return true;


            default:
                    return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Home_page.this);
        alertDialogBuilder.setTitle("Confirm Exit");

        alertDialogBuilder.setMessage("Are you sure you want to exit");
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Home_page.this, "You Click On Cancel", Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}

