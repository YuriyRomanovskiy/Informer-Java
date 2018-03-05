package com.example.brand.informer.DataManager;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.brand.informer.DataManager.ResourceManager.ResourceManager;
import com.example.brand.informer.R;

/**
 * Created by brand on 05.03.2018.
 */

public class DetailDataController implements IController {
    private Activity activity;
    private Context context;

    private String detailNameString;
    private String detailFullDesrString;
    private String detailImagePath;
    private String detailShortDesrString;
    private String detailLinkString;

    private TextView detailName;
    private TextView shortDesc;
    private TextView fullDesc;
    private ImageView image;
    private TextView detailLink;

    public DetailDataController(Activity activity, Context context){
        this.activity = activity;
        this.context = context;
    }

    public void initFields(){
        detailNameString= activity.getIntent().getExtras().getString("name");
        detailFullDesrString = activity.getIntent().getExtras().getString("fullDesc");
        detailImagePath = activity.getIntent().getExtras().getString("image2");
        detailShortDesrString = activity.getIntent().getExtras().getString("shortDesc");
        detailLinkString = activity.getIntent().getExtras().getString("link");
    }

    private void initView(){
        detailName = (TextView)activity.findViewById(R.id.detailName);
        shortDesc = (TextView)activity.findViewById(R.id.detailDesc);
        fullDesc = (TextView)activity.findViewById(R.id.detailFullDesc);
        image = (ImageView)activity.findViewById(R.id.detailImage2);
        detailLink = (TextView)activity.findViewById(R.id.detailLink);
    }

    private void setValueInView(){
        detailName.setText(detailNameString);
        shortDesc.setText(detailShortDesrString);
        fullDesc.setText(detailFullDesrString);
        detailLink.setText(detailLinkString);
        image.setImageResource(ResourceManager.getDrawableResourceID(context, detailImagePath));
    }

    public void constructView() {
        initFields();
        initView();
        setValueInView();
    }
}
