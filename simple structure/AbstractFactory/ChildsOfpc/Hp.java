package com.my.designpattern.designpattern.AbstractFactory.ChildsOfpc;

import android.content.Context;
import com.my.designpattern.designpattern.AbstractFactory.Interface.Pc;

public class Hp implements Pc{

    private Context context;

    public Hp() {
    }

    public Hp(Context context) {
        this.context = context;
    }

    @Override
    public void displayPc() {
    }
}
