package com.example.hms.WeightAndMesearmunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hms.R;

public class ShowData extends AppCompatActivity {

    private Button Update;
    private Button view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        Update = (Button) findViewById(R.id.btnWeightUpd);
        Update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Update();
            }
        });
    }
        public void Update() {

            Intent intent = new Intent(this, Update.class);
            startActivity(intent);
    }
    }

