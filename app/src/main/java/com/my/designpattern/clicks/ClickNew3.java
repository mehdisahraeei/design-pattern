package com.my.designpattern.clicks;

import android.content.Context;
import android.view.View;
import com.my.designpattern.designpattern.ProtoType;


public class ClickNew3 {

    private Context context;

    public ClickNew3(Context context) {
        this.context = context;
    }

    public void ClickL(View view)
    {
        //------ProtoType--used-----
        ProtoType object1=new ProtoType(context);

        ProtoType object2=(ProtoType)object1.clone1();


        object2.Display();


    }

}
