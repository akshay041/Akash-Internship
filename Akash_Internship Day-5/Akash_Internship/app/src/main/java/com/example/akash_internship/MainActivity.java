package com.example.akash_internship;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button registration;
    EditText name, email, password, mobileNo, hobby1, hobby2, hobby3, hobby4;
    RadioGroup radioGroup;
    String gender;
    RadioButton male, female, other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().hide();

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        mobileNo = findViewById(R.id.mobileNo);
        hobby1 = findViewById(R.id.hobby1);
        hobby2 = findViewById(R.id.hobby2);
        hobby3 = findViewById(R.id.hobby3);
        hobby4 = findViewById(R.id.hobby4);
        registration = findViewById(R.id.registration_btn);
        radioGroup = findViewById(R.id.radiogroup);


        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        other = findViewById(R.id.other);


        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (male.isChecked()) {
                    gender = "Male";
                } else if (female.isChecked()) {
                    gender = "Female";
                } else if (other.isChecked()) {
                    gender = "Other";
                }

                Intent intent = new Intent(MainActivity.this, Home.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("password", password.getText().toString());
                intent.putExtra("gender", gender);
                intent.putExtra("mobileNo", mobileNo.getText().toString());
                intent.putExtra("hobby1", hobby1.getText().toString());
                intent.putExtra("hobby2", hobby2.getText().toString());
                intent.putExtra("hobby3", hobby3.getText().toString());
                intent.putExtra("hobby4", hobby4.getText().toString());

                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}