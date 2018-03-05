package com.example.brand.informer.DataManager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.Toast;

import com.example.brand.informer.DataManager.CellAdapter.CustomCellAdapter;
import com.example.brand.informer.DataManager.FileParser.JSONParser;
import com.example.brand.informer.DataModel.ItemList;
import com.example.brand.informer.DetailActivity;
import com.example.brand.informer.MainActivity;
import com.example.brand.informer.R;

/**
 * Created by brand on 04.03.2018.
 */

public class DataController implements IController {
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

    public void constructView(){
        if (itemList == null){
            return ;
        }
        JSONParser jsonParser = new JSONParser(activity, R.raw.items2);
        itemList = jsonParser.fileDecode();
        ListView listview = (ListView) activity.findViewById(R.id.listview);
        listview.setAdapter(new CustomCellAdapter(context, itemList));
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long id) {
                Intent intent = new Intent(activity, DetailActivity.class);
                intent.putExtra("name",itemList.item[pos].name);
                intent.putExtra("shortDesc",itemList.item[pos].desc2);
                intent.putExtra("fullDesc",itemList.item[pos].fullDesc);
                intent.putExtra("image2",itemList.item[pos].image2);
                intent.putExtra("link",itemList.item[pos].link);
                activity.startActivity(intent);
            }
        });
    }


}
