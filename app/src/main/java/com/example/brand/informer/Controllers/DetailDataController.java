package com.example.brand.informer.Controllers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.example.brand.informer.DataManager.ViewModels.ViewModel;
import com.example.brand.informer.WebActivity;

/**
 * Created by brand on 05.03.2018.
 */

public class DetailDataController extends Controller {

    private String detailNameString;
    private String detailFullDesrString;
    private String detailImagePath;
    private String detailShortDesrString;
    private String detailLinkString;

    private ViewModel model;


    public DetailDataController(Activity activity, Context context){
        this.activity = activity;
        this.context = context;
        model = new ViewModel(activity,context);
    }

    @Override
    protected void initFields(){
        detailNameString= activity.getIntent().getExtras().getString("name");
        detailFullDesrString = activity.getIntent().getExtras().getString("fullDesc");
        detailImagePath = activity.getIntent().getExtras().getString("image2");
        detailShortDesrString = activity.getIntent().getExtras().getString("shortDesc");
        detailLinkString = activity.getIntent().getExtras().getString("link");
    }

    @Override
    protected void initView(){
        model.initViews();
    }

    @Override
    protected void setValueInView(){
        model.setImageToImgView(detailImagePath);
        model.setTextFullDesc(detailFullDesrString);
        model.setTextToLink(detailLinkString);
        model.setTextToName(detailNameString);
        model.setTextToShortDesc(detailShortDesrString);
    }

    @Override
    public void constructView() {
        initFields();
        initView();
        setValueInView();
    }

    public void shareData(){
        Intent intent = new Intent(activity, WebActivity.class);
        intent.putExtra("webLink",detailLinkString);
        activity.startActivity(intent);

    }
}
