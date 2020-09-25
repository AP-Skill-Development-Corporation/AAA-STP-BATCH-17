package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    int[] images={R.drawable.g1anjaneya,R.drawable.g2cinnamon,
    R.drawable.g3garlic,R.drawable.g4kfc,R.drawable.g5ocean,
    R.drawable.g6subhani,R.drawable.g7swawarma,R.drawable.g8tamatoes,
    R.drawable.g9udayasankar,R.drawable.g10venkatesh};

    String[] names={"HOTEL-1","HOTEL-2","HOTEL-3","HOTEL-4","HOTEL-5",
    "HOTEL-6","HOTEL-7","HOTEL-8","HOTEL-9","HOTEL-10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rec);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new MyAdapter(this,images,names));
    }
}
