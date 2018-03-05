package com.example.brand.informer.Controllers;

import android.app.Activity;
import android.content.Context;

/**
 * Created by brand on 05.03.2018.
 */

abstract class Controller implements IController {
    protected Activity activity;
    protected Context context;

    abstract protected void initFields();
    abstract protected void initView();
    abstract protected void setValueInView();
    abstract public void constructView();

}
