package com.example.menusandpickers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b_alertdialog,b_datepicker,b_timepicker;
    int c_year,c_month,c_date;
    int mhours,mMinutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_alertdialog=findViewById(R.id.alert);
        b_datepicker=findViewById(R.id.datepicker);
        b_datepicker.setOnClickListener(this);
        b_alertdialog.setOnClickListener(this);
        b_timepicker=findViewById(R.id.timepicker);
        b_timepicker.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menus,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.favorites:
                Toast.makeText(this, "Selected favourites", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.add:
                Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show();
                break;
            case R.id.search:
                Toast.makeText(this, "Search is selected", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.alert:
                openalertdialog();
                break;
            case R.id.datepicker:
                opendatepicker();
                break;
            case R.id.timepicker:
                opentimepicker();
                break;
        }
    }

    private void opentimepicker() {
        Calendar c= Calendar.getInstance();
        mhours=c.get(Calendar.HOUR_OF_DAY);
        mMinutes=c.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog= new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                String mytime=i+":"+i1;
                Toast.makeText(MainActivity.this, mytime, Toast.LENGTH_SHORT).show();
            }
        },mhours,mMinutes,false);
    timePickerDialog.show();
    }

    private void opendatepicker() {
        Calendar c= Calendar.getInstance();
        c_year=c.get(Calendar.YEAR);
        c_month=c.get(Calendar.MONTH);
        c_date=c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
             String mydate=i+"-"+(i1+1)+"-"+i2;
                Toast.makeText(MainActivity.this, mydate, Toast.LENGTH_SHORT).show();
            }
        },c_year,c_month,c_date);
        datePickerDialog.show();

    }

    private void openalertdialog() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Welcome All");
        builder.setIcon(R.drawable.ic_launcher_background);
        builder.setMessage("Are you sure to exit the app");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            finish();
            }
        });
        builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }

}
