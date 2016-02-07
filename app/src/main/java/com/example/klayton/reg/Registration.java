package com.example.klayton.reg;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.klayton.krishighor_test.R;

public class Registration extends AppCompatActivity {

    EditText e_name,e_user,e_pass,e_img;

    Button reg;

    String name,u_user,u_pass,u_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
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

        e_name = (EditText)findViewById(R.id.name);
        e_user = (EditText)findViewById(R.id.u_name);
        e_pass = (EditText)findViewById(R.id.pass);
        e_img = (EditText)findViewById(R.id.img_loc);

        reg = (Button)findViewById(R.id.register);


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = e_name.getText().toString();
                u_user = e_user.getText().toString();
                u_pass = e_pass.getText().toString();
                u_img = e_img.getText().toString();




                String method = "register";


                BackgroundTask backgroundTask =  new BackgroundTask(getApplicationContext());
                backgroundTask.execute(method,name,u_user,u_pass,u_img);
                finish();

            }
        });

    }

}
