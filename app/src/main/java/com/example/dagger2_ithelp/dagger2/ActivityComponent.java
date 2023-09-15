package com.example.dagger2_ithelp.dagger2;


import com.example.dagger2_ithelp.MainActivity;
import com.example.dagger2_ithelp.module.StudentModule;
import com.example.dagger2_ithelp.module.TeacherModule;
import com.example.dagger2_ithelp.school.School;

import javax.inject.Inject;

import dagger.Component;

@Component(modules = {StudentModule.class, TeacherModule.class})
public interface ActivityComponent {

    School getSchool();
    void inject(MainActivity mainActivity);


}
