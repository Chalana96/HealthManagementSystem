package com.example.hms.Food;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hms.R;

public class FoodInsert extends AppCompatActivity {

    private Button foodView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_insert);

        foodView = (Button) findViewById(R.id.btnViewMeals);
        foodView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMeals();
            }
        });
    }
        public void ShowMeals() {

            Intent intent = new Intent(this, ShowMeals.class);
            startActivity(intent);
        }
    }

