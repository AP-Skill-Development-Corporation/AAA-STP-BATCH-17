package com.example.roomdata;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = Students_Entity.class,version = 1,exportSchema = false)
public abstract class StudentDataBase extends RoomDatabase
{
    public abstract StudentDAO studentDAO();



}
