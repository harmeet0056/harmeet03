package com.example.harmeet03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;

public class ActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent fromPrevious = getIntent();
        String EmailAddress = fromPrevious.getStringExtra("EmailAddress");
        int age = fromPrevious.getIntExtra("Age", 18);
        String name = fromPrevious.getStringExtra("Name");
        String pCode = fromPrevious.getStringExtra("PostalCode");
        Intent call = new Intent(Intent.ACTION_DIAL);
        call.setData(Uri.parse("tel:" + pCode));
    }
    Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);




}