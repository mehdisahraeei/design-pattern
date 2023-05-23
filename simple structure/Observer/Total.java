package com.my.designpattern.designpattern.Observer;

import android.content.Context;
import android.widget.Toast;

public class Total implements Observer {

    private int x, t;
    private Subject subject;
    private Context context;

    public Total(Subject subjectn, Context context) {
        subject = subjectn;
        this.context = context;
        subject.Register(this);
    }

    @Override
    public void update(int x, int y) {
        int ResultT = x + y;
        Toast.makeText(context, "\n" + "Total is: " + ResultT + "\n", Toast.LENGTH_SHORT).show();
    }
}
