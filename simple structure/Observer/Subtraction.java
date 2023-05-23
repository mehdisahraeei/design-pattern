package com.my.designpattern.designpattern.Observer;

import android.content.Context;
import android.widget.Toast;

public class Subtraction implements Observer {

    private int x,t;
    private Subject subject;
    private Context context;


    public Subtraction(Subject subjectn,Context context) {
        subject = subjectn;
        this.context=context;
        subject.Register(this);
    }

    @Override
    public void update(int x, int y) {
        int ResultS=x-y;
        Toast.makeText(context, "\n" + "Subtraction is: " + ResultS + "\n", Toast.LENGTH_SHORT).show();
    }
}
