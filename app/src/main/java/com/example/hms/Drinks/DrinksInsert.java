package com.example.hms.Drinks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.hms.R;

public class DrinksInsert extends AppCompatActivity {

    private Button DrinksShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_insert);

        DrinksShow = (Button) findViewById(R.id.btnDrinkView);
        DrinksShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrinksView();
            }
        });
    }
        public void DrinksView(){
            Intent intent = new Intent(this,DrinksView.class);
            startActivity(intent);
        }

    }

