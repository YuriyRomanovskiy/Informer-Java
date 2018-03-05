package com.example.brand.informer.DataManager.CellAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.brand.informer.DataManager.ResourceManager.ResourceManager;
import com.example.brand.informer.DataModel.ItemList;
import com.example.brand.informer.R;

/**
 * Created by brand on 04.03.2018.
 */

public class CustomCellAdapter extends BaseAdapter {

    Context context;
    ItemList data;

    private static LayoutInflater inflater = null;

    public CustomCellAdapter(Context context, ItemList data) {
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.item.length;
    }

    @Override
    public Object getItem(int position) {
        return data.item[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null)
            view = inflater.inflate(R.layout.custom_row, null);
        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText(data.item[position].name);
        TextView desc1 = (TextView) view.findViewById(R.id.desc1);
        desc1.setText(data.item[position].desc1);
        TextView desc2 = (TextView) view.findViewById(R.id.desc2);
        desc2.setText(data.item[position].desc2);
        ImageView image = (ImageView) view.findViewById(R.id.iamge1);
        image.setImageResource(ResourceManager.getDrawableResourceID(context,data.item[position].image1));
        return view;
    }

}
