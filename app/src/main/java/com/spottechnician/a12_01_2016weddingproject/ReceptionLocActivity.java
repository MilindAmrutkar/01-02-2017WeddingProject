package com.spottechnician.a12_01_2016weddingproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReceptionLocActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reception_loc);
    }

    public void startNavigation(View view) {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.co.in/maps/place/Shree+Banquets/@18.9998213,73.1160715,18z/data=!3m1!4b1!4m5!3m4!1s0x3be7e84698790e55:0x7abe90ec8086cf29!8m2!3d18.9998199!4d73.1166717"));
        startActivity(intent);
    }
}
