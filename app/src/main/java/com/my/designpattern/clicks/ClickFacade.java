package com.my.designpattern.clicks;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.my.designpattern.designpattern.Facade.MakerFinal;


public class ClickFacade {

    private Context context;

    public ClickFacade(Context context) {
        this.context = context;
    }


    public void ClickL1(View view)
    {
        //------facade--used-----


        Toast.makeText(context,new MakerFinal().DisplayOne(), Toast.LENGTH_SHORT).show();

    }



    public void ClickL2(View view)
    {
        //------facade--used-----

        Toast.makeText(context,new MakerFinal().DisplayTwo(), Toast.LENGTH_SHORT).show();

    }

}
