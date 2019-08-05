package com.example.hms.CommonParts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hms.Drinks.DrinksInsert;
import com.example.hms.Food.FoodInsert;
import com.example.hms.R;
import com.example.hms.WeightAndMesearmunt.WeightMeas;

public class Front extends AppCompatActivity {


    private Button foods;
    private Button weight;
    private Button drinks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        //Foods
        foods = (Button) findViewById(R.id.btnfood);
        foods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FoodInsert();
            }
        });

        //Weight and Body Measurements
        weight = (Button) findViewById(R.id.btnweight);
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeightMeas();
            }
        });

        //drinks
        drinks = (Button)findViewById(R.id.btnwater);
        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    DrinksInsert();
            }
        });
    }

    //Foods
    public void FoodInsert() {

        Intent intent = new Intent(this, FoodInsert.class);
        startActivity(intent);
    }

    public void DrinksInsert() {

        Intent intent = new Intent(this, DrinksInsert.class);
        startActivity(intent);
    }

    //Weight and Body Measurements
    public void WeightMeas() {

        Intent intent = new Intent(this, WeightMeas.class);
        startActivity(intent);
    }

}

