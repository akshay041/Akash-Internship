package com.example.akash_internship;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Home extends AppCompatActivity {
    String Name, Email, Password, MobileNo, Gender, Hobby1, Hobby2, Hobby3, Hobby4;
    TextView name, password, email, mobileNo, hobby1, hobby2, hobby3, hobby4, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        name = findViewById(R.id.show_name);
        email = findViewById(R.id.show_email);
        password = findViewById(R.id.show_password);
        gender = findViewById(R.id.show_gender);
        hobby1 = findViewById(R.id.show_hobby1);
        hobby2 = findViewById(R.id.show_hobby2);
        hobby3 = findViewById(R.id.show_hobby3);
        hobby4 = findViewById(R.id.show_hobby4);
        mobileNo = findViewById(R.id.show_mobileNo);

        Intent i = getIntent();
        Name = i.getStringExtra("name");
        Email = i.getStringExtra("email");
        Password = i.getStringExtra("password");
        Gender = i.getStringExtra("gender");
        MobileNo = i.getStringExtra("mobileNo");
        Hobby1 = i.getStringExtra("hobby1");
        Hobby2 = i.getStringExtra("hobby2");
        Hobby3 = i.getStringExtra("hobby3");
        Hobby4 = i.getStringExtra("hobby4");


        name.setText(Name);
        password.setText(Password);
        email.setText(Email);
        mobileNo.setText(MobileNo);
        hobby1.setText(Hobby1);
        hobby2.setText(Hobby2);
        hobby3.setText(Hobby3);
        hobby4.setText(Hobby4);
        gender.setText(Gender);
    }
}