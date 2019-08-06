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
    private  Button diert;
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

        //diert
        diert = (Button) findViewById(R.id.btnDiert);
        diert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DiertPlan();
            }
        });
    }

    //Foods
    public void FoodInsert() {

        Intent intent = new Intent(this, FoodInsert.class);
        startActivity(intent);
    }
    //Drinks
    public void DrinksInsert() {

        Intent intent = new Intent(this, DrinksInsert.class);
        startActivity(intent);
    }

    //WBody Measurements
    public void WeightMeas() {

        Intent intent = new Intent(this, WeightMeas.class);
        startActivity(intent);
    }

    //Diert
    public void DiertPlan() {

        Intent intent = new Intent(this, com.example.hms.CommonParts.DiertPlan.class);
        startActivity(intent);
    }

}

