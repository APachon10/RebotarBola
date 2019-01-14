package com.example.tnb_20.rebotarbola;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    SensorManager sensorMgr;
    Sensor sensor;
    ImageView img;

    // Control de la velocitat
    float velocitat = 2.0f;
    float iniciX, iniciY;

    // Mides per fer càlculs
    int statusBar, width, height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = setContentView(findViewById(R.id.Bola));
    }
}
