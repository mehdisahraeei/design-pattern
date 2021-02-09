package com.my.designpattern.clicks;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.my.designpattern.designpattern.Factory.FactoryProducer;
import com.my.designpattern.designpattern.Factory.Media;
import com.my.designpattern.designpattern.Observer.Calculation;
import com.my.designpattern.designpattern.Observer.Subtraction;
import com.my.designpattern.designpattern.Observer.Total;

public class Clickobserver {

    private Context context;

    public Clickobserver(Context context) {
        this.context = context;
    }

    public void ClickL(View view)
    {
        //------observer--used-----
        Calculation calculation=new Calculation();
        Total total=new Total(calculation,context);
        Subtraction subtraction=new Subtraction(calculation,context);
        calculation.setParametr(10,5);
    }


}
