
# AppName:RoomData

# Add Dependencie at build.gradle(Module:app)

    implementation 'androidx.recyclerview:recyclerview:1.1.0'

activity_main.xml
------------------

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="RoomDataBaseExample"
        android:textColor="#9C27B0"
        android:textSize="25sp"
        android:gravity="center"
        android:textStyle="bold"/>
    <EditText
        android:id="@+id/id"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Student Id"
        android:textSize="20sp"
        android:inputType="number"
        android:textStyle="bold"
        android:textColorHint="#673AB7"/>
    <EditText
        android:id="@+id/name"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Student Name"
        android:textSize="20sp"
        android:inputType="number"
        android:textStyle="bold"
        android:textColorHint="#673AB7"/>
    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#C0E8FA"
        android:layout_margin="20dp"
        android:text="SaveData"
        android:onClick="save"/>
    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#C0E8FA"
        android:layout_margin="20dp"
        android:text="Retrivedata"
        android:onClick="retrive"/>

<androidx.recyclerview.widget.RecyclerView
    android:id="@+id/rec"
    android:layout_width="match_parent"
    android:layout_height="match_parent"/>

</LinearLayout>



MainActivity
-----------
package com.example.roomdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText stu_id,stu_name;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rec);
        stu_id=findViewById(R.id.id);
        stu_name=findViewById(R.id.name);

    }

    public void save(View view)
    {
      String sid=  stu_id.getText().toString();

      String name=  stu_name.getText().toString();




    }

    public void retrive(View view)
    {

    }
}

SampleOutput:
-------------
![WhatsApp Image 2020-09-30 at 8 18 17 PM](https://user-images.githubusercontent.com/51777024/94701322-2a817800-035a-11eb-84ea-7b672ac862f8.jpeg)


