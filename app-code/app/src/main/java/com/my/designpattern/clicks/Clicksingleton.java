package com.my.designpattern.clicks;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.my.designpattern.designpattern.Singleton;


public class Clicksingleton {

    private Context context;

    public Clicksingleton(Context context) {
        this.context = context;
    }

    public void ClickL(View view)
    {
        //------Singleton--used-----
        Toast.makeText(context, Singleton.getInstance().setT("singletonActivity"), Toast.LENGTH_SHORT).show();
    }

}
