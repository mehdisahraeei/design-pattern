package com.my.designpattern.designpattern.AbstractFactory.ChildsOfpc;

import android.content.Context;
import android.widget.Toast;
import com.my.designpattern.designpattern.AbstractFactory.Interface.Pc;

public class iMac implements Pc {


    private Context context;

    public iMac() {
    }

    public iMac(Context context) {
        this.context = context;
    }

    @Override
    public void displayPc() {
        Toast.makeText(context, "iMac", Toast.LENGTH_SHORT).show();
    }

}
