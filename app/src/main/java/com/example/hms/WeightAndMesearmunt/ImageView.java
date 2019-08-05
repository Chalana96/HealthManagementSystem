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


    private static final int PICK_IMAGE_REQUEST = 1;
    private Button btnChooseButton;
    private Button btnUpload;
    private TextView showUploads;
    private EditText typeDate;
    private View B_image_View;
    private ProgressBar mProgessBar;

    private Uri mImageUri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);




            btnChooseButton = findViewById(R.id.btnChooseImage);
            btnUpload = findViewById(R.id.btnUpload);
            showUploads = findViewById(R.id.tvShowUpload);
            typeDate = findViewById(R.id.editText);
            B_image_View = findViewById(R.id.image_view);
            mProgessBar = findViewById(R.id.progesBar);

            btnChooseButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openFileChooser();
                }
            });

            btnUpload.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            showUploads.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
        private void openFileChooser()
        {
            Intent intent = new Intent();
            intent.setType("image/*");
            intent.setAction(Intent.ACTION_GET_CONTENT);
            startActivityForResult(intent, PICK_IMAGE_REQUEST);
        }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
            super.onActivityResult(requestCode, resultCode, data);

            if(requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null)
            {
                mImageUri = data.getData();

             //   Picasso.get().load(mImageUri).into((Target) B_image_View);
            }
        }
    }

