package com.example.brand.informer.DataManager.WebClients;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by brand on 05.03.2018.
 */

public class WebClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url)
    {
        view.loadUrl(url);
        return true;
    }
}
