package com.muneiah.example.actvitylifecycles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView label;

//First
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label=findViewById(R.id.tv);
        label.append("onCreate()\n");
        Log.i("MainActivity","onCreate()");
        Toast.makeText(this, "App is Created", Toast.LENGTH_SHORT).show();

    }
    //Second


    @Override
    protected void onStart() {
        super.onStart();
        label.append("onStart()\n");
        Log.i("MainActivity","onStart()");
        Toast.makeText(this, "App is Started", Toast.LENGTH_SHORT).show();
    }
    //Third

    @Override
    protected void onResume() {
        super.onResume();
        label.append("onResume()\n");
        Log.i("MainActivity","onResume()");
        Toast.makeText(this, "App is Resumed", Toast.LENGTH_SHORT).show();
    }
    //fourth

    @Override
    protected void onPause() {
        super.onPause();
        label.append("onPause()\n");
        Log.i("MainActivity","onPause()");
        Toast.makeText(this, "App is Paused", Toast.LENGTH_SHORT).show();
    }
    //fifth

    @Override
    protected void onStop() {
        super.onStop();
        label.append("onStop()\n");
        Log.i("MainActivity","onStop()");
        Toast.makeText(this, "App is Stopped", Toast.LENGTH_SHORT).show();
    }
//six
    @Override
    protected void onDestroy() {
        super.onDestroy();
        label.append("onDestroy()\n");
        Log.i("MainActivity","onDestroy()");
        Toast.makeText(this, "App is Destroyed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        label.append("onRestart()\n");
        Log.i("MainActivity","onRestart()");
        Toast.makeText(this, "App is Restart", Toast.LENGTH_SHORT).show();
    }
}