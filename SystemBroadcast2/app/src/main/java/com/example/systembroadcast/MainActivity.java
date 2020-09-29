package com.example.systembroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    MyReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.img);

        IntentFilter filter=new IntentFilter();

        filter.addAction(Intent.ACTION_POWER_CONNECTED);

        filter.addAction(Intent.ACTION_POWER_DISCONNECTED);

        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);

        receiver=new MyReceiver(imageView);

        this.registerReceiver(receiver,filter);

    }
}
