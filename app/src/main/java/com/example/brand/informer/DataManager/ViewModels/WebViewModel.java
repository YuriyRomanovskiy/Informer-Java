package com.example.brand.informer.DataManager.ViewModels;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;

import com.example.brand.informer.DataManager.WebClients.WebClient;
import com.example.brand.informer.R;


/**
 * Created by brand on 05.03.2018.
 */

public class WebViewModel extends Model {

    private WebView webView;

    public WebViewModel(Activity activity, Context context){
        this.activity = activity;
        this.context = context;
    }

    @Override
    public void initViews(){
        webView = (WebView)activity.findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebClient());
    }

    public void setLinkToWebView(String link){
        webView.loadUrl(link);


    }
}
