package com.example.brand.informer.DataManager;

import android.app.Activity;
import android.content.Context;
import android.widget.ListView;
import android.widget.TableLayout;

import com.example.brand.informer.DataManager.CellAdapter.CustomCellAdapter;
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

    public void constructTable(){
        if (itemList == null){
            return ;
        }
        JSONParser jsonParser = new JSONParser(activity, R.raw.items2);
        itemList = jsonParser.fileDecode();
        ListView listview = (ListView) activity.findViewById(R.id.listview);
        listview.setAdapter(new CustomCellAdapter(context, itemList));
    }


}
