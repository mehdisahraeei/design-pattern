package com.my.designpattern.designpattern.Observer;

import android.content.Context;
import android.widget.Toast;

public class Default implements Observer {

    private int x, t;
    private Subject subject;
    private Context context;


    public Default(Subject subjectn, Context context) {
        subject = subjectn;
        this.context = context;
        subject.Register(this);
    }

    @Override
    public void update(int x, int y) {

//        Toast.makeText(context, "Default values are: " + "X: "
//                + x + "Y: " + y + "\n", Toast.LENGTH_SHORT).show();
    }
}
