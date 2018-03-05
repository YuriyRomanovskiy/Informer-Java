package com.example.brand.informer.Controllers;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import com.example.brand.informer.DataManager.ViewModels.WebViewModel;

/**
 * Created by brand on 05.03.2018.
 */

public class WebDataController extends Controller {

    private WebViewModel webViewModel;

    private String linkString;

    public WebDataController(Activity activity, Context context){
        this.activity = activity;
        this.context = context;
        webViewModel = new WebViewModel(activity,context);
    }

    @Override
    protected void initFields(){
        linkString= activity.getIntent().getExtras().getString("webLink");
    }

    @Override
    protected void initView(){
        webViewModel.initViews();
    }

    @Override
    protected void setValueInView(){
        webViewModel.setLinkToWebView(linkString);
    }

    @Override
    public void constructView() {
        initFields();
        initView();
        setValueInView();
    }
}

