package com.example.loginapp1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.util.jar.Attributes;

public class LoginForm extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private Button Login;
    private TextView Info;


    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        getSupportActionBar().setTitle("Login Form ");

        Email = (EditText)findViewById(R.id.email1);
        Password = (EditText)findViewById(R.id.pwd);
        Login = (Button)findViewById(R.id.log);
        Info = (TextView)findViewById(R.id.tvInfo);



        //Login.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View view) {
              //  String email = Email.getText().toString().trim();
                //String password = Password.getText().toString().trim();


                //if (TextUtils.isEmpty(email))
               // {
                 //   Toast.makeText(LoginForm.this," Please Enter Email",Toast.LENGTH_SHORT);
                   // return;
                //}
                //if (TextUtils.isEmpty(password))
                //{
                  //  Toast.makeText(LoginForm.this," Please Enter Password",Toast.LENGTH_SHORT);
                    //return;
                //}

                //if (password.length() < 6) {
                  //  Toast.makeText(LoginForm.this, "Password too short ", Toast.LENGTH_SHORT);
                    //return;
                //}


                                // ...



        //    }
        //});



        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               validate(Email.getText().toString() , Password.getText().toString());
            }
        });

    }

    public void btn_signup(View view) {
        startActivity(new Intent(getApplicationContext(),Signup.class) );

    }

    private void validate(String email, String userPassword){
        if((email.equals("nikhilwadhwa887@gmail.com")) && (userPassword.equals("1234567"))){
            Intent intent = new Intent(LoginForm.this, SecondActivity.class);
            startActivity(intent);
        }
        else{
            counter--;

            Info.setText("No of attempts remaining: " + String.valueOf(counter));

            if(counter == 0){
                Login.setEnabled(false);
            }

        }
    }
}
