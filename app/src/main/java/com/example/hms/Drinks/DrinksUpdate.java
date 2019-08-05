package com.example.hms.Drinks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.hms.CommonParts.Front;
import com.example.hms.R;

public class DrinksUpdate extends AppCompatActivity {

    private  Button update;
    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_update);

        update = (Button) findViewById(R.id.btnDrinksUpdate);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrinksUpdate();
            }
        });


        home = (Button) findViewById(R.id.btnDrinksHome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Front();
            }
        });
    }
    public void DrinksUpdate(){
        Intent intent = new Intent(this,DrinksUpdate.class);
        startActivity(intent);
    }

    public void Front(){
        Intent intent = new Intent(this,Front.class);
        startActivity(intent);
    }



}
