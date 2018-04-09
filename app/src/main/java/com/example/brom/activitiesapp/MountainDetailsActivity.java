package com.example.brom.activitiesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_details);
        Bundle extras = getIntent().getExtras();

        String name = extras.getString("EXTRA_NAME");
        String location = extras.getString("EXTRA_LOCATION");
        String height = extras.getString("EXTRA_HEIGHT");

        Toast.makeText(getApplicationContext(), name, Toast.LENGTH_SHORT).show();

        TextView nameText = (TextView) findViewById(R.id.textView);
        TextView heightText = (TextView) findViewById(R.id.textView2);
        TextView locationText = (TextView) findViewById(R.id.textView3);

        nameText.setText(name);
        heightText.setText(height);
        locationText.setText(location);
    }
}
