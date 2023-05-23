package com.my.designpattern.designpattern.AbstractFactory.ChildsOfmobile;

import android.content.Context;
import com.my.designpattern.designpattern.AbstractFactory.Interface.Mobile;

public class Sony implements Mobile {

    private Context context;

    public Sony() {
    }

    public Sony(Context context) {
        this.context = context;
    }

    @Override
    public void displayMobile() {
    }

}
