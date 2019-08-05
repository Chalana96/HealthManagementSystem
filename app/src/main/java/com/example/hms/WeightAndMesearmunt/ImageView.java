package com.example.hms.WeightAndMesearmunt;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.hms.R;

public class ImageView extends AppCompatActivity {

private Button image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);


        image = (Button) findViewById(R.id.btnImage);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView();
            }
        });

    }


    public void ImageView() {

        Intent intent = new Intent(this, com.example.hms.WeightAndMesearmunt.ImageView.class);
        startActivity(intent);
    }
    }


