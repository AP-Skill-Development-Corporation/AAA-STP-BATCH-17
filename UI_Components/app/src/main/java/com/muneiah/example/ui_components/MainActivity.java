package com.muneiah.example.ui_components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
SeekBar seekBar;
TextView tv_seekbar,tv_rating;
RatingBar ratingBar;
ImageView image;
ImageButton img_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar=findViewById(R.id.sb);
        tv_seekbar=findViewById(R.id.seekbar_tv);
        ratingBar=findViewById(R.id.rb);
        tv_rating=findViewById(R.id.tv_rb);
        image=findViewById(R.id.iv);
        img_button=findViewById(R.id.image_button);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.image_resource);
            }
        });

        img_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img_button.setImageResource(R.drawable.image_resource);
            }
        });


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                tv_rating.setText(String.valueOf(v));
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_seekbar.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}