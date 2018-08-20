package com.login.android.toll_taking;


import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class RegistrationActivity extends AppCompatActivity {


    private EditText Name,email;
    private EditText Password;
    private TextView loginpage;
    private Button Register;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Name = (EditText) findViewById(R.id.vehicle);
        Password = (EditText) findViewById(R.id.password);
        email=(EditText)findViewById(R.id.email);
        loginpage = (TextView) findViewById(R.id.back);
        Register = (Button) findViewById(R.id.register);

        loginpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( RegistrationActivity.this,MainActivity.class));
            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( RegistrationActivity.this,Main2Activity.class));
            }
        });
    }

}
