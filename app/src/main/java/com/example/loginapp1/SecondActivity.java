package com.example.loginapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button aboutme;
    private Button workexperience;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setTitle("Profile Page");

        aboutme = (Button)findViewById(R.id.educationButton);
        aboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
        workexperience = (Button)findViewById(R.id.workingButton);
        workexperience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });
    }
    public void openActivity3()
    {
        Intent intent = new Intent(this, aboutme.class);
        startActivity(intent);
    }
    public void openActivity4()
    {
        Intent intent = new Intent(this, workexperience.class);
        startActivity(intent);
    }


}
