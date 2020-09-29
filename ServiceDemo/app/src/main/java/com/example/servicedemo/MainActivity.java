package com.example.servicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.playbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                Intent start=new Intent(getApplicationContext(),MyService.class);

                startService(start);

            }
        });

        findViewById(R.id.stopbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                Intent stop=new Intent(getApplicationContext(),MyService.class);

                stopService(stop);
            }
        });
    }
}
