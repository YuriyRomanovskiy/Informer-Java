package com.example.brand.informer.DataManager;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Created by brand on 03.03.2018.
 */

public class CellCreator extends AppCompatActivity {

    private TableLayout mainLayout;
    private ImageView image;
    private TableRow cell;
    private TableLayout childLayout;
    private TableRow childRow1;
    private TableRow childRow2;
    private TableRow childRow3;
    private TextView name;
    private TextView desc1;
    private TextView desc2;
    private Context context;

    public CellCreator(Context context){
        this.context = context;
    }

    private void InitializeCellComponents(){
        mainLayout = new TableLayout(context);
        image = new ImageView(context);
        cell = new TableRow(context);
        childLayout = new TableLayout(context);
        childRow1 = new TableRow(context);
        childRow2 = new TableRow(context);
        childRow3 = new TableRow(context);
        name = new TextView(context);
        desc1 = new TextView(context);
        desc2 = new TextView(context);
    }

    private void FillCell(String name, String desc1, String desc2, int image){
        this.name.setText(name);
        this.desc1.setText(desc1);
        this.desc2.setText(desc2);
        this.image.setImageResource(image);

    }

    private void ConstructCellComponents(){
        childRow1.addView(name);
        childRow2.addView(desc1);
        childRow3.addView(desc2);
        childLayout.addView(childRow1);
        childLayout.addView(childRow2);
        childLayout.addView(childRow3);
        cell.addView(image);
        cell.addView(childLayout);
        mainLayout.addView(cell);
    }

    public TableLayout CreateCell(String name, String desc1, String desc2, int image){
        InitializeCellComponents();
        FillCell(name,desc1,desc2,image);
        ConstructCellComponents();
        return mainLayout;
    }

}
