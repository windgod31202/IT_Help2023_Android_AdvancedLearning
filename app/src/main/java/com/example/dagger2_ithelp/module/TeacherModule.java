package com.example.dagger2_ithelp.module;

import com.example.dagger2_ithelp.Teacher.Teacher;
import com.example.dagger2_ithelp.Teacher.TeacherNumber;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class TeacherModule {
    @Provides
    static TeacherNumber provideTeacherNumber(){
        TeacherNumber teacherNumber = new TeacherNumber("1234567890");
        teacherNumber.getNumber();
        return teacherNumber;
    }

    @Provides
    static Teacher provideTeacher(TeacherNumber teacherNumber){
        return new Teacher(teacherNumber);
    }
}
