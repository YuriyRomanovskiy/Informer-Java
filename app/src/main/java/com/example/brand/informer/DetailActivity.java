package com.example.brand.informer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brand.informer.Controllers.DetailDataController;

public class DetailActivity extends AppCompatActivity {

    private DetailDataController dataController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        dataController = new DetailDataController(DetailActivity.this, this);
        dataController.constructView();
    }


    public void onMyButtonClick(View view)
    {
        dataController.shareData();
    }


}
