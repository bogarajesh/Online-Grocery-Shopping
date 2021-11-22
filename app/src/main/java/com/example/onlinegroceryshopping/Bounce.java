package com.example.onlinegroceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Selection;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Bounce extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ArrayList<String> Selection = new ArrayList<String>();

    Button btnaddcart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bounce);
        btnaddcart = findViewById(R.id.AddCart1);



        btnaddcart.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
    }
    });


    Spinner spinner1 = findViewById(R.id.spinner1);
    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.Quantity, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(this);


    Spinner spinner2 = findViewById(R.id.spinner2);
    ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.Quantity, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);

    Spinner spinner3 = findViewById(R.id.spinner3);
    ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.Quantity, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(this);
}

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text=parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void SelectItems(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkBox1:
                if (checked) {
                    Selection.add("");
                } else {
                    Selection.remove("");
                }
                break;
            case R.id.checkBox2:
                if (checked) {
                    Selection.add("");
                } else {
                    Selection.remove("");
                }
                break;
            case R.id.checkBox3:
                if (checked) {
                    Selection.add("");
                } else {
                    Selection.remove("");
                }
                break;
        }

    }
}
