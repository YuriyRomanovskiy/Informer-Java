package com.example.brand.informer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.brand.informer.DataManager.DataController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        DataController dataController = new DataController(MainActivity.this,this);
        dataController.constructView();

    }

}
