package com.example.brand.informer.DataManager.ViewModels;

import android.app.Activity;
import android.content.Context;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.brand.informer.DataManager.ResourceManager.ResourceManager;
import com.example.brand.informer.R;

import java.util.List;

/**
 * Created by brand on 05.03.2018.
 */

public class ViewModel extends Model {

    private TextView detailName;
    private TextView shortDesc;
    private TextView fullDesc;
    private ImageView image;
    private Button detailButton;

    public ViewModel(Activity activity, Context context){
        this.activity = activity;
        this.context = context;
    }

    @Override
    public void initViews(){
        detailName = (TextView)activity.findViewById(R.id.detailName);
        shortDesc = (TextView)activity.findViewById(R.id.detailDesc);
        fullDesc = (TextView)activity.findViewById(R.id.detailFullDesc);
        image = (ImageView)activity.findViewById(R.id.detailImage2);
        detailButton = (Button)activity.findViewById(R.id.detailButton);
    }

    public void setTextToName(String text){
        detailName.setText(text);
    }

    public void setTextToShortDesc(String text){
        shortDesc.setText(text);
    }

    public void setTextFullDesc(String text){
        fullDesc.setText(text);
    }

    public void setImageToImgView(String text){
        image.setImageResource(ResourceManager.getDrawableResourceID(context, text));
    }

    public void setTextToLink(String text){
        detailButton.setText(text);
    }
}
