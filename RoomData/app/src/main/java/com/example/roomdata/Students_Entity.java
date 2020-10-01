package com.example.roomdata;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student_table")
public class Students_Entity
{

    @ColumnInfo(name = "studentname")
    String name;

    @ColumnInfo(name = "studentrollno")
    @PrimaryKey
    @NonNull
    String rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    public String getRollno() {
        return rollno;
    }

    public void setRollno(@NonNull String rollno) {
        this.rollno = rollno;
    }
}
