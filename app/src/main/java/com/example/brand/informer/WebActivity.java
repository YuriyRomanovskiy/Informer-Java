package com.example.brand.informer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.brand.informer.Controllers.WebDataController;

public class WebActivity extends AppCompatActivity {

    private WebDataController webDataController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webDataController = new WebDataController(WebActivity.this, this);
        webDataController.constructView();
    }
}
