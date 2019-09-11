package com.example.hms.WeightAndMesearmunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hms.CommonParts.FirstPage;
import com.example.hms.CommonParts.Front;
import com.example.hms.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.util.Calendar;

public class WeightMeas extends AppCompatActivity {

    private Button showD;
    private Button btnimage;
    private Button view;
    private TextView mDate_CalendarView;

    EditText waist, chest, shoulder, arm, thigh, calf, hip, weight, height;
    Button submit;
    DatabaseReference reff;
    Member member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_meas);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());

        TextView textViewDate = findViewById(R.id.Date_View);
        textViewDate.setText(currentDate);

        mDate_CalendarView = (TextView) findViewById(R.id.Date_View);

        waist = (EditText)findViewById(R.id.etWaist);
        chest = (EditText)findViewById(R.id.etChest);
        shoulder = (EditText)findViewById(R.id.etShoulder);
        arm = (EditText)findViewById(R.id.etArm);
        thigh = (EditText)findViewById(R.id.etThigh);
        calf = (EditText)findViewById(R.id.etCalf);
        hip = (EditText)findViewById(R.id.etHip);
        weight = (EditText)findViewById(R.id.etWeight);
        height = (EditText)findViewById(R.id.etHeight);
        submit = (Button)findViewById(R.id.btnWeightSubmit);
        member = new Member();
        reff = FirebaseDatabase.getInstance().getReference().child("Member1");
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float Waist = Float.parseFloat(waist.getText().toString());
                float Chest = Float.parseFloat(chest.getText().toString());
                float Shoulder = Float.parseFloat(shoulder.getText().toString());
                float Arm = Float.parseFloat(arm.getText().toString());
                float Thigh = Float.parseFloat(thigh.getText().toString());
                float Calf = Float.parseFloat(calf.getText().toString());
                float Hip = Float.parseFloat(hip.getText().toString());
                float Weight = Float.parseFloat(weight.getText().toString());
                float Height = Float.parseFloat(height.getText().toString());

                member.setWaist(waist);
                member.setChest(chest);
                member.setShoulder(shoulder);
                member.setArm(arm);
                member.setThigh(thigh);
                member.setCalf(calf);
                member.setHip(hip);
                member.setWeight(weight);
                member.setHeight(height);

                reff.child("Member1").setValue(member);
                Toast.makeText(WeightMeas.this, "Data Inserted",Toast.LENGTH_LONG).show();
            }
        });



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

