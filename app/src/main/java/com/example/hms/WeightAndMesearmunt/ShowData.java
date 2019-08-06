package com.example.hms.WeightAndMesearmunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.hms.CommonParts.FirstPage;
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

        view = (Button) findViewById(R.id.btnShow);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowData();
            }
        });
    }
        public void Update () {
            Toast.makeText(ShowData.this, "Measurement Update", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Update.class);
            startActivity(intent);
        }

            public void ShowData() {
                Toast.makeText(ShowData.this, "Show Data", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, ShowData.class);
                startActivity(intent);
            }
        }

