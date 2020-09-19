package com.example.intentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String msg="APSSDC";

                Intent i=new Intent(MainActivity.this,Second.class);

                i.putExtra("gopal",msg);

                startActivity(i);

            }
        });

        findViewById(R.id.g1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Uri uri=Uri.parse("http://www.google.com");

                Intent intent=new Intent(Intent.ACTION_VIEW,uri);

                startActivity(intent);


            }
        });

        findViewById(R.id.c1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                Uri uri=Uri.parse("tel:9346890335");

                Intent intent=new Intent(Intent.ACTION_DIAL,uri);

                startActivity(intent);



            }
        });


    }
}
