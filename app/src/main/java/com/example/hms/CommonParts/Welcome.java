package com.example.hms.CommonParts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hms.R;

import java.util.Timer;
import java.util.TimerTask;

public class Welcome extends AppCompatActivity {

    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);




            //Toast.makeText(Welcome.this,"FireBase Connect Successfully!",Toast.LENGTH_SHORT).show();

            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    Intent intent = new Intent(Welcome.this, FirstPage.class);
                    startActivity(intent);
                    finish();

                }
            }, 2000);

        }
    }

