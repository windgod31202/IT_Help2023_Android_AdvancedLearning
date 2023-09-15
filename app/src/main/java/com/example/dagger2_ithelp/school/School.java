package com.example.dagger2_ithelp.school;

import android.util.Log;

import com.example.dagger2_ithelp.Student.Student;
import com.example.dagger2_ithelp.Teacher.Teacher;

import javax.inject.Inject;

public class School {
    private static final String TAG = "School";
    private Teacher teacher;
    private Student student;

    @Inject
    public School(Teacher teacher, Student student) {
        this.teacher = teacher;
        this.student = student;
        Log.e(TAG, "School OK!");
    }
    public School(){
        Log.e(TAG, "School OK!");
    }

    public void complete(){
        Log.e(TAG, "complete OK!");
    }
}
