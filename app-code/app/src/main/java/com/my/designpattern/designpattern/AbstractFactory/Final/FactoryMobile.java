package com.my.designpattern.designpattern.AbstractFactory.Final;

import android.content.Context;
import com.my.designpattern.designpattern.AbstractFactory.ChildsOfmobile.Samsung;
import com.my.designpattern.designpattern.AbstractFactory.ChildsOfmobile.Sony;
import com.my.designpattern.designpattern.AbstractFactory.ChildsOfmobile.iPhone;
import com.my.designpattern.designpattern.AbstractFactory.Interface.Mobile;
import com.my.designpattern.designpattern.AbstractFactory.Interface.Pc;

public class FactoryMobile extends abstractfactory{

    private Context context;

    public FactoryMobile(Context context) {
        this.context = context;
    }

    @Override
    public Mobile setMobile(int n) {
        if (n==0)
        {
            return new Sony();
        }
        else if (n==1)
        {
            return new iPhone(context);
        }
        else if (n==2)
        {
            return new Samsung();
        }
        return null;
    }

    @Override
    public Pc setPc(int n) {
        return null;
    }

}
