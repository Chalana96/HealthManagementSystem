package com.example.hms.WeightAndMesearmunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hms.Food.FoodInsert;
import com.example.hms.R;

public class Update extends AppCompatActivity {
    private Button update;
    private Button view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

            update = (Button) findViewById(R.id.btnupdateP);
            update.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Update();
                }
            });

            view = (Button) findViewById(R.id.btnViewUp);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ShowData();
                }
            });
        }

        //Foods
        public void Update() {

            Intent intent = new Intent(this, com.example.hms.WeightAndMesearmunt.Update.class);
            startActivity(intent);
        }
    public void ShowData() {

        Intent intent = new Intent(this, com.example.hms.WeightAndMesearmunt.ShowData.class);
        startActivity(intent);
    }

    }

