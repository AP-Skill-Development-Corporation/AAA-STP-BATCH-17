package com.example.covidapiretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.example.covidapiretrofit.databinding.ActivityMainBinding;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        EndPointService service=CovidInstance.getRetrofitInstance().create(EndPointService.class);

        Call<String> c=service.getdata();

        c.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {

               // Toast.makeText(MainActivity.this, ""+response.body(), Toast.LENGTH_SHORT).show();

                try {
                    JSONArray rootarray=new JSONArray(response.body());
                    JSONObject rootobjcet=rootarray.getJSONObject(rootarray.length()-1);
                    String res_country=rootobjcet.getString("Country");
                    String res_conform=rootobjcet.getString("Confirmed");
                    String res_deaths=rootobjcet.getString("Deaths");
                    String res_recovered=rootobjcet.getString("Recovered");
                    String res_active=rootobjcet.getString("Active");
                    String res_date=rootobjcet.getString("Date");


                   binding.cName.setText("COUNTRY:"+res_country);
                   binding.cConform.setText("CONFIRMED:"+res_conform);
                   binding.sDeaths.setText("DEATHS:"+res_deaths);
                   binding.cRecover.setText("RECOVERED:"+res_recovered);
                   binding.cActive.setText("ACTIVE:"+res_active);
                   binding.cDate.setText("DATE:"+res_date);


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

                Toast.makeText(MainActivity.this, "DONT GET ANY DATA", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
