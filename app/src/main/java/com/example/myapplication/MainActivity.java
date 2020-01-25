package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ListView lv;
        ArrayAdapter adapter;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] separated = {"Hi", "Bye", "What", "LOL", "MOCK"};
        adapter = new ArrayAdapter(this, R.layout.activity_listview, separated);
        lv = findViewById(R.id.option_list);
        lv.setAdapter(adapter);
    }
}
