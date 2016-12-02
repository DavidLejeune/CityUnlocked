package com.cityunlocked.david.cityunlocked;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class ChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        getWindow().getDecorView().setBackgroundColor(Color.rgb(255,255,255));

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {



                switch(position) {
                    case 2:
                        final Intent mapIntent = new Intent(ChoiceActivity.this, MapActivity.class);
                        ChoiceActivity.this.startActivity(mapIntent);
                        //ChoiceActivity.this.finish();
                        break;
                    default:
                        Toast.makeText(ChoiceActivity.this, "you just love clicking shit don't you",
                                Toast.LENGTH_SHORT).show();
                        //Toast.makeText(ChoiceActivity.this, "" + position,
                        //        Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}
