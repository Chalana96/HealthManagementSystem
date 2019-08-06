package com.example.hms.WeightAndMesearmunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.hms.CommonParts.FirstPage;
import com.example.hms.CommonParts.Front;
import com.example.hms.R;

public class WeightMeas extends AppCompatActivity {

    private Button showD;
    private Button btnimage;
    private Button view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_meas);


        //Show Details
        showD = (Button) findViewById(R.id.btnWeightSubmit3);
        showD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowData();
            }
        });


        //Upload Body Image
        btnimage = (Button) findViewById(R.id.btnImage);
        btnimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView();
            }
        });

        view = (Button) findViewById(R.id.btnWeightSubmit3);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowData();
            }
        });

    }
    public void ShowData() {
        Toast.makeText(WeightMeas.this,"Data Inserted",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ShowData.class);
        startActivity(intent);
    }

    public void ImageView() {

        Intent intent = new Intent(this, ImageView.class);
        startActivity(intent);

    }


}

