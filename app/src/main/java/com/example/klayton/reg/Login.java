package com.example.klayton.reg;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.klayton.krishighor_test.R;

public class Login extends AppCompatActivity {

    EditText e_user,e_pass;
    Button login,reg;
    String login_user,login_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        e_user = (EditText)findViewById(R.id.user);
        e_pass = (EditText)findViewById(R.id.pass);
         login = (Button)findViewById(R.id.login);
        reg = (Button)findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                login_user = e_user.getText().toString();
                login_pass = e_pass.getText().toString();

                String method = "login";

                BackgroundTask backgroundTask = new BackgroundTask(getApplicationContext());
                backgroundTask.execute(method,login_user,login_pass);


            }
        });


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Registration.class);
                startActivity(i);
            }
        });


    }





}
