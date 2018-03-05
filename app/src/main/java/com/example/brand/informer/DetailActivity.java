package com.example.brand.informer;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.brand.informer.DataManager.DetailDataController;
import com.example.brand.informer.DataManager.ResourceManager.ResourceManager;

public class DetailActivity extends AppCompatActivity {

    private String detailNameString;
    private String detailFullDesrString;
    private String detailImagePath;
    private String detailShortDesrString;
    private String detailLinkString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        DetailDataController dataController = new DetailDataController(DetailActivity.this, this);
        dataController.constructView();
    }

}
