package com.example.hms.Food;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hms.R;

public class ShowMeals extends AppCompatActivity {
    private Button upFd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_meals);

        upFd = (Button) findViewById(R.id.btnFoodUpdate);
        upFd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateFood();
            }
        });
    }

        public void UpdateFood() {

            Intent intent = new Intent(this, UpdateFood.class);
            startActivity(intent);
        }


}
