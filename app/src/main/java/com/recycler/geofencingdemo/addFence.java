package com.recycler.geofencingdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class addFence extends AppCompatActivity {
    Global sharedData = Global.getInstance();
    private EditText Latitude, Longitude, Radius;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_fence);
        Latitude = findViewById(R.id.Latitude);
        Longitude= findViewById(R.id.Longitude);
        Radius = findViewById(R.id.Radius);


    }
    public void Submit(View view) {
        String Lats = Latitude.getText().toString();

        String Longs = Longitude.getText().toString();

        String Rads = Radius.getText().toString();
        if (Lats.isEmpty() || Longs.isEmpty() || Rads.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please enter all the data..", Toast.LENGTH_SHORT).show();
            return;
        }
        double rade=Double.parseDouble(Rads);
        double late=Double.parseDouble(Lats);
        double lange=Double.parseDouble(Longs);


        // validating if the text fields are empty or not.

        sharedData.setValueLat(late);
        sharedData.setValueLong(lange);
        sharedData.setValueRad(rade);
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);



    }
    public void Current(View view)
    {
        Latitude.setText(String.valueOf(sharedData.getValueCurrLat()));
        Longitude.setText(String.valueOf(sharedData.getValueCurrLongs()));

    }
}