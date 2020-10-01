package com.example.roomdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UpDateActivity extends AppCompatActivity {


    EditText uname,uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_up_date);

        uid=findViewById(R.id.id_update);

        uname=findViewById(R.id.name_update);

        Intent intent=getIntent();

        String n=intent.getStringExtra("name");
        String id=intent.getStringExtra("rollno");
        uid.setText(id);
        uname.setText(n);
        uid.setKeyListener(null);


    }

    public void updatedata(View view)
    {

        String res_id=uid.getText().toString();

        String res_name=uname.getText().toString();

        Students_Entity entity=new Students_Entity();

        entity.setRollno(res_id);
        entity.setName(res_name);

        MainActivity.studentDataBase.studentDAO().updateData(entity);

        Toast.makeText(this, "UpdateSucessfully "+res_name, Toast.LENGTH_SHORT).show();

        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
