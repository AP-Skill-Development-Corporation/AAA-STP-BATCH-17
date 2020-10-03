package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user_email,user_pwd;
    TextView textView;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences=getSharedPreferences("gopal",MODE_PRIVATE);
        user_email=findViewById(R.id.et1);
        user_pwd=findViewById(R.id.et2);
        textView=findViewById(R.id.tv);
    }

    public void savedata(View view)
    {
      String e= user_email.getText().toString();
      String p=user_pwd.getText().toString();
      SharedPreferences.Editor editor=preferences.edit();
      editor.putString("email",e);
      editor.putString("pwd",p);
      editor.apply();
      Toast.makeText(this, "saved sucessfully", Toast.LENGTH_SHORT).show();
      user_email.setText("");
      user_pwd.setText("");
    }

    public void retrivedata(View view)
    {

      String e1=  preferences.getString("email",null);
      String p1=preferences.getString("pwd",null);

      textView.setText("The Reult"+e1+"\n"+p1);
    }
}
