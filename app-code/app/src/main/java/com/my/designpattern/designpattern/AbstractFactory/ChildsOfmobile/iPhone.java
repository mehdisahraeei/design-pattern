package com.my.designpattern.designpattern.AbstractFactory.ChildsOfmobile;

import android.content.Context;
import android.widget.Toast;

import com.my.designpattern.designpattern.AbstractFactory.Interface.Mobile;

public class iPhone implements Mobile {

    private Context context;

    public iPhone() {
    }

    public iPhone(Context context) {
        this.context = context;
    }

    @Override
    public void displayMobile() {
        Toast.makeText(context, "iphone", Toast.LENGTH_SHORT).show();
    }
}

