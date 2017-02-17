package com.spottechnician.a12_01_2016weddingproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResidenceAddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_residence_address);
    }

    public void startNavigation(View view) {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.co.in/maps/place/Nimisha+Pride+CHS,+Sector+8,+New+Panvel+East,+Panvel,+Navi+Mumbai,+Maharashtra+410206/@19.0029997,73.1213603,95m/data=!3m1!1e3!4m5!3m4!1s0x3be7e84515907541:0x7f6b6ea47f469563!8m2!3d19.0030017!4d73.1215449"));
        startActivity(intent);
    }
}
