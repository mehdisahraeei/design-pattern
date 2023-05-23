package com.my.designpattern.designpattern.AbstractFactory.Final;

import android.content.Context;

public class FactoryProducer {

    private static Context context;

    public FactoryProducer(Context context) {
        this.context = context;
    }

    public static abstractfactory getAbstractfactory(int WhichFactory)
    {
        if (WhichFactory==0)
        {
            return new FactoryMobile(context);
        }
        else if (WhichFactory==1)
        {
            return new FactoryPc(context);
        }
        return null;
    }

}
