package com.my.designpattern.designpattern.AbstractFactory.ChildsOfmobile;

import android.content.Context;
import com.my.designpattern.designpattern.AbstractFactory.Interface.Mobile;

public class Samsung implements Mobile {

    private Context context;

    public Samsung() {
    }

    public Samsung(Context context) {
        this.context = context;
    }

    @Override
    public void displayMobile() {
    }
}
