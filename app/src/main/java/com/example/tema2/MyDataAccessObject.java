package com.example.tema2;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MyDataAccessObject {

    @Insert
    public void addStudent(Student student);

    @Query("select * from students")
    public List<Student> getStudents();

    @Delete
    public void deleteStudent(Student student);
}
