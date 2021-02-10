package com.example.bloodbank;

import android.content.SharedPreferences;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    public static FirebaseDatabase database;

    Button buttonDonor;
    Button buttonInfo;
    Button needBlood;

    public static String donorId="no";
    SharedPreferences sharedPreferences;

    public static Double lat=0.0;
    public static Double lng=0.0;

    private final int MY_PERMISSIONS_REQUEST_READ_CONTACTS=1;

    GoogleApiClient mGoogleApiClient;
    LocationManager locationManager;
    LocationListener locationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}