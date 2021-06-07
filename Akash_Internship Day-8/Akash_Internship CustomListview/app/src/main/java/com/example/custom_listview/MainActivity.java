package com.example.custom_listview;

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
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> msg = new ArrayList<>();
    Custom_adapter custom_adapter;
    EditText edit_name, edit_msg;
    Button add_btn;
    String ed_name, ed_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().hide();
        listView = findViewById(R.id.listview);
        edit_name = findViewById(R.id.edit_name);
        edit_msg = findViewById(R.id.edit_msg);
        add_btn = findViewById(R.id.add_btn);
//
//        name.add("Darshan");
//        name.add("Arjav");
//        name.add("Smit");
//
//        msg.add("hii");
//        msg.add("hllo");
//        msg.add("hey");
//
        custom_adapter = new Custom_adapter(MainActivity.this, name, msg);
        listView.setAdapter(custom_adapter);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed_name = edit_name.getText().toString();
                ed_msg = edit_msg.getText().toString();

                if (ed_name.equals("")) {
                    edit_name.setError("enter name");
                } else if (name.contains(ed_name)) {
                    edit_name.setError("this name is already there");
                } else if (ed_msg.equals("")) {
                    edit_msg.setError("enter msg");
                } else {

                    name.add(ed_name);
                    msg.add(ed_msg);
                    custom_adapter.notifyDataSetChanged();


                }
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