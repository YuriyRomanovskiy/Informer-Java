package com.example.brand.informer.Controllers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.brand.informer.DataManager.CellAdapter.CustomCellAdapter;
import com.example.brand.informer.DataManager.FileParser.JSONParser;
import com.example.brand.informer.DataModel.ItemList;
import com.example.brand.informer.DetailActivity;
import com.example.brand.informer.R;

/**
 * Created by brand on 04.03.2018.
 */

public class DataController extends Controller {
    private ItemList itemList;
    private ListView listview;

    public DataController(Activity activity, Context context){
        this.activity = activity;
        this.context = context;
        constructItemList();
    }


    @Override
    protected void initFields(){
        JSONParser jsonParser = new JSONParser(activity, R.raw.items2);
        itemList = jsonParser.fileDecode();
    }

    @Override
    protected void initView(){
        listview = (ListView) activity.findViewById(R.id.listview);
    }


    @Override
    protected void setValueInView(){
        listview.setAdapter(new CustomCellAdapter(context, itemList));
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long id) {
                Intent intent = new Intent(activity, DetailActivity.class);
                intent.putExtra("name",itemList.getItem()[pos].getName());
                intent.putExtra("shortDesc",itemList.getItem()[pos].getDesc2());
                intent.putExtra("fullDesc",itemList.getItem()[pos].getFullDesc());
                intent.putExtra("image2",itemList.getItem()[pos].getImage2());
                intent.putExtra("link",itemList.getItem()[pos].getLink());
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public void constructView(){
        initFields();
        initView();
        setValueInView();
    }

    private void constructItemList(){
        JSONParser jp = new JSONParser(activity, R.raw.items2);
        itemList = jp.fileDecode();
    }
}
