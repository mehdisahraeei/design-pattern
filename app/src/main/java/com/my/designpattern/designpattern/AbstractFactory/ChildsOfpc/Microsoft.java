package com.my.designpattern.designpattern.AbstractFactory.ChildsOfpc;

import android.content.Context;
import com.my.designpattern.designpattern.AbstractFactory.Interface.Pc;

public class Microsoft implements Pc {

    private Context context;

    public Microsoft() {
    }

    public Microsoft(Context context) {
        this.context = context;
    }

    @Override
    public void displayPc() {
    }


}
