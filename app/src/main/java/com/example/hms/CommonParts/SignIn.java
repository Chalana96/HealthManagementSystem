package com.example.hms.CommonParts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hms.R;

public class SignIn extends AppCompatActivity {

    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        back = (Button) findViewById(R.id.btnRegSignIn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn();
            }
        });
    }
public void SignIn() {


            Intent intent = new Intent(this, SignIn.class);
            startActivity(intent);
        }
}
