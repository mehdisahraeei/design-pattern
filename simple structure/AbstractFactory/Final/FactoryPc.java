package com.my.designpattern.designpattern.AbstractFactory.Final;

import android.content.Context;
import com.my.designpattern.designpattern.AbstractFactory.ChildsOfpc.Hp;
import com.my.designpattern.designpattern.AbstractFactory.ChildsOfpc.Microsoft;
import com.my.designpattern.designpattern.AbstractFactory.ChildsOfpc.iMac;
import com.my.designpattern.designpattern.AbstractFactory.Interface.Mobile;
import com.my.designpattern.designpattern.AbstractFactory.Interface.Pc;

public class FactoryPc extends abstractfactory{

    private Context context;

    public FactoryPc(Context context) {
        this.context = context;
    }

    @Override
    public Pc setPc(int n) {
        if (n==0)
        {
            return new iMac(context);
        }
        else if (n==1)
        {
            return new Hp();
        }
        else if (n==2)
        {
            return new Microsoft();
        }
        return null;
    }



    @Override
    public Mobile setMobile(int n) {
        return null;
    }


}
