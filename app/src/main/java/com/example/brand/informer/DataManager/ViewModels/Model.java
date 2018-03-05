package com.example.brand.informer.DataManager.ViewModels;

import android.app.Activity;
import android.content.Context;

/**
 * Created by brand on 05.03.2018.
 */

abstract class Model {
    protected Activity activity;
    protected Context context;

    public abstract void initViews();
}
