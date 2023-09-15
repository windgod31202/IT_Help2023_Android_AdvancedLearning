package com.example.dagger2_ithelp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dagger2_ithelp.dagger2.ActivityComponent;
import com.example.dagger2_ithelp.dagger2.DaggerActivityComponent;
import com.example.dagger2_ithelp.school.School;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    School school;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent activityComponent = DaggerActivityComponent.create();

        activityComponent.inject(this);

        school.complete();

    }
}