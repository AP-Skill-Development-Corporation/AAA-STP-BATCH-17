package com.example.roomdata;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface StudentDAO
{
    @Insert
    public void insertData(Students_Entity entity);
    @Update
    public void updateData(Students_Entity entity);
    @Delete
    public void deleteData(Students_Entity entity);

    //for live data
    @Query("SELECT * FROM student_table")
   // public LiveData<List<Students_Entity>> retriveData();

    public List<Students_Entity> retriveData();//Normal data
}
