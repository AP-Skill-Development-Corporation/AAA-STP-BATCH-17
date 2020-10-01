package com.example.roomdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText stu_id,stu_name;

    RecyclerView recyclerView;

    StudentAdapter adapter;

   static StudentDataBase studentDataBase;

    Students_Entity entity;

    List<Students_Entity> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rec);
        stu_id=findViewById(R.id.id);
        stu_name=findViewById(R.id.name);

        studentDataBase= Room.databaseBuilder(this,StudentDataBase.class,"mydb").allowMainThreadQueries().build();

        stu_id.setText("");
        stu_name.setText("");



    }

    public void save(View view)
    {
      String sid=  stu_id.getText().toString();

      String name=  stu_name.getText().toString();

      entity=new Students_Entity();

      entity.setRollno(sid);

      entity.setName(name);

      studentDataBase.studentDAO().insertData(entity);

        Toast.makeText(this, "sucessfully inserted "+name, Toast.LENGTH_SHORT).show();

    }

    public void retrive(View view)
    {

        list=studentDataBase.studentDAO().retriveData();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter=new StudentAdapter(this,list);

        recyclerView.setAdapter(adapter);
    }
}
