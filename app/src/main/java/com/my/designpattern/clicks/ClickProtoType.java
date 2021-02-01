package com.my.designpattern.clicks;

import android.content.Context;
import android.view.View;
import com.my.designpattern.designpattern.ProtoType;


public class ClickProtoType {

    private Context context;

    public ClickProtoType(Context context) {
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
