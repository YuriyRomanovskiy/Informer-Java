package com.example.brand.informer.DataManager.ResourceManager;

import android.content.Context;

/**
 * Created by brand on 04.03.2018.
 */

public class ResourceManager {
    public static  int getDrawableResourceID(Context context, String resource){
        return context.getResources().getIdentifier(resource,"drawable","com.example.brand.informer") ;
    }
}
