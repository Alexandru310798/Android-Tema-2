package com.example.tema2;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "students")
public class Student {

   @NonNull
   @PrimaryKey
    private String name;

    @ColumnInfo(name = "mark")
    private String mark;

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getMark() {
        return mark;
    }
}
