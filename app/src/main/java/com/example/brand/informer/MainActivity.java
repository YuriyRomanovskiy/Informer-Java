package com.example.brand.informer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import com.example.brand.informer.DataManager.CellCreator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        CellCreator cellCreator = new CellCreator(this);
        TableLayout mainLayout = cellCreator.CreateCell("1","2","3",R.drawable.divide);
        setContentView(mainLayout);
    }
}
