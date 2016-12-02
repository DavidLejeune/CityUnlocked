package com.cityunlocked.david.cityunlocked;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class MapActivity extends AppCompatActivity  {

    private static final String[]paths = {"", "Food", "Drink"};

    @Override
    protected void onResume() {
        super.onResume();

        hideshit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        hideshit();
        Spinner dropdown = (Spinner)findViewById(R.id.spinner);
        String[] items = new String[]{"", "Food", "Drink"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        final View imageButton1 = findViewById(R.id.mark1);
        imageButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // do whatever we wish!
                hideshit();
                final View imageItem1 = findViewById(R.id.mapitem1);
                imageItem1.setVisibility(View.VISIBLE);
            }
        });

        final View imageButton2 = findViewById(R.id.mark2);
        imageButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // do whatever we wish!
                hideshit();
                Toast.makeText(MapActivity.this, "Stop clicking me all over . \nIt's getting weird ....",
                        Toast.LENGTH_SHORT).show();
            }
        });

        final View imageButton3 = findViewById(R.id.mark3);
        imageButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // do whatever we wish!
                hideshit();
                Toast.makeText(MapActivity.this, "Y u do dis ?",
                        Toast.LENGTH_SHORT).show();
            }
        });


        final View imageButton4 = findViewById(R.id.mark4);
        imageButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // do whatever we wish!

                hideshit();
                final View imageItem1 = findViewById(R.id.mapitem2);
                imageItem1.setVisibility(View.VISIBLE);
            }
        });

        final View imageButton5 = findViewById(R.id.imageView6);
        imageButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // do whatever we wish!
                hideshit();
            }
        });


        final View imageButton6 = findViewById(R.id.mapitem1);
        imageButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // do whatever we wish!
                final Intent infoIntent = new Intent(MapActivity.this, InfoActivity.class);
                MapActivity.this.startActivity(infoIntent);
                //MapActivity.this.finish();
            }
        });


    }


    public void hideshit(){
        final View imageItem1 = findViewById(R.id.mapitem1);
        imageItem1.setVisibility(View.GONE);
        final View imageItem2 = findViewById(R.id.mapitem2);
        imageItem2.setVisibility(View.GONE);
    }
}