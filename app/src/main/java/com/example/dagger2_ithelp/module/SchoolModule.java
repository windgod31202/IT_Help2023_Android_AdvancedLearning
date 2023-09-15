package com.example.dagger2_ithelp.module;

import com.example.dagger2_ithelp.Student.StudentNumber;
import com.example.dagger2_ithelp.Teacher.TeacherNumber;
import com.example.dagger2_ithelp.school.School;
import com.example.dagger2_ithelp.Student.Student;
import com.example.dagger2_ithelp.Teacher.Teacher;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class SchoolModule {
    @Provides
    static Student provideStudentNumber(StudentNumber studentNumber){
        studentNumber.getNumber();
        return new Student(studentNumber);
    }

    @Provides
    static Student provideStudent(){
        Student student = new Student();
        student.study();
        return new Student();
    }

    @Provides
    static Teacher provideTeacherNumber(TeacherNumber teacherNumber){
        teacherNumber.getNumber();
        return new Teacher(teacherNumber);
    }

    @Provides
    static Teacher provideTeacher(){
        Teacher teacher = new Teacher();
        teacher.teach();
        return new Teacher();
    }

    @Provides
    static School provideSchool(Teacher teacher, Student student){
        return new School(teacher, student);
    }
}
