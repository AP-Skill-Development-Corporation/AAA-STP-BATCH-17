package com.example.covidapiretrofit;


import retrofit2.Call;
import retrofit2.http.GET;


public interface EndPointService
{
    @GET("/dayone/country/IN")
    Call<String> getdata();

}
