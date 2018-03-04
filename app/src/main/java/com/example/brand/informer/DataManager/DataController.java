package com.example.brand.informer.DataManager;

import android.app.Activity;
import android.content.Context;
import android.provider.ContactsContract;
import android.widget.TableLayout;

import com.example.brand.informer.DataManager.CellCreator.CellCreator;
import com.example.brand.informer.DataManager.FileParser.JSONParser;
import com.example.brand.informer.DataModel.ItemList;
import com.example.brand.informer.MainActivity;
import com.example.brand.informer.R;

/**
 * Created by brand on 04.03.2018.
 */

public class DataController {
    private ItemList itemList;
    private Activity activity;
    private Context context;


    public DataController(Activity activity, Context context){
        this.activity = activity;
        this.context = context;
        constructItemList();
    }

    private void constructItemList(){
        JSONParser jp = new JSONParser(activity, R.raw.items2);
        itemList = jp.fileDecode();
    }

    public TableLayout constructTable(){
        if (itemList == null){
            return null;
        }
        CellCreator cellCreator = new CellCreator(context);
        return cellCreator.cteateCellGrid(itemList);
    }

}
