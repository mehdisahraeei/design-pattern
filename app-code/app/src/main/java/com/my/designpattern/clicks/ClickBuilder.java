package com.my.designpattern.clicks;

import android.content.Context;
import android.view.View;
import com.my.designpattern.designpattern.Builder;

public class ClickBuilder {

    private Context context;

    public ClickBuilder(Context context) {
        this.context = context;
    }

    public void ClickL(View view)
    {
        //------Builder--used-----

        Builder builder=new Builder.BuilderInto(context).setFirstname("mahdi").
                setLastname("sahrai").setAge(22).display().getthis();

        String result=builder.toString();

    }

}
