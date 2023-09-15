package com.example.dagger2_ithelp.module;

import com.example.dagger2_ithelp.Student.Student;
import com.example.dagger2_ithelp.Student.StudentNumber;
import com.example.dagger2_ithelp.school.School;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class StudentModule {
    @Provides
    static Student provideStudent(StudentNumber studentNumber){
        return new Student(studentNumber);
    }

    @Provides
    static StudentNumber provideStudentNumber(){
        StudentNumber studentNumber = new StudentNumber("1234567890");
        studentNumber.getNumber();
        return studentNumber;
    }
}
