package com.my.designpattern.clicks;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.my.designpattern.designpattern.Factory.FactoryProducer;
import com.my.designpattern.designpattern.Factory.Media;

public class ClickNew5 {

    private Context context;

    public ClickNew5(Context context) {
        this.context = context;
    }

    public void ClickL(View view)
    {
        //------factory--used-----
        FactoryProducer producer=new FactoryProducer();
        Media media=producer.setMedia("film");
        Toast.makeText(context, media.dispMedia("New Film"), Toast.LENGTH_SHORT).show();
    }

}
