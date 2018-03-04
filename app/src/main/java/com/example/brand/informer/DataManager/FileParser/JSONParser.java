package com.example.brand.informer.DataManager.FileParser;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;

import com.example.brand.informer.DataModel.ItemList;
import com.example.brand.informer.R;
import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by brand on 04.03.2018.
 */

public class JSONParser {
    private Activity activity;
    private int resourceFile;

    public JSONParser(Activity activity, int resInt){
        this.activity = activity;
        resourceFile = resInt;
    }

    public ItemList fileDecode(){

        String jsonData = getStringFromRawFile(activity);
        Gson gson = new Gson();
        ItemList data = gson.fromJson(jsonData, ItemList.class);//final res
        return data;
    }

    private String  getStringFromRawFile(Activity activity) {
        Resources r = activity.getResources();

        InputStream is = r.openRawResource(resourceFile);
        String myText = null;
        try {
            myText = convertStreamToString(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  myText;
    }

    private String  convertStreamToString(InputStream is) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int i = is.read();
        while( i != -1)
        {
            baos.write(i);
            i = is.read();
        }
        return  baos.toString();
    }
}
