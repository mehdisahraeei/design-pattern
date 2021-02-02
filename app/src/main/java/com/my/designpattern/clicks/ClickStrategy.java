package com.my.designpattern.clicks;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.my.designpattern.designpattern.Strategy.Choose1;
import com.my.designpattern.designpattern.Strategy.Languages;
import com.my.designpattern.designpattern.Strategy.Makers.Creator1;

public class ClickStrategy {

    private Context context;

    public ClickStrategy(Context context) {
        this.context = context;
    }


    public void ClickL(View v)
    {
        Languages n=new Creator1();
        Toast.makeText(context, n.printfinal(), Toast.LENGTH_SHORT).show();
    }

}
