package com.dolic.statesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.dolic.statesapp.dao.StatesDAO;
import com.dolic.statesapp.database.StatesDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.testBtn);


        btn.setOnClickListener(v -> {

            StatesDatabase database = StatesDatabase.getInstance(this);
            StatesDAO dao = database.statesDao();

            Log.d("TAG", "onCreate: " + dao.getDrzave().get(0).imeDrzave);

        });


    }
}