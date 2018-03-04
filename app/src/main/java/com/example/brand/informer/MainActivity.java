package com.example.brand.informer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import com.example.brand.informer.DataManager.DataController;
import com.example.brand.informer.DataModel.ItemList;

public class MainActivity extends AppCompatActivity {


    private ItemList itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DataController dataController = new DataController(MainActivity.this,this);
        TableLayout mainLayout = dataController.constructTable();
        setContentView(mainLayout);
    }







}
