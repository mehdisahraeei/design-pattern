package com.my.designpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;

import com.my.designpattern.clicks.ClickAbstractfactory;
import com.my.designpattern.databinding.ActivityAbstractFactoryBinding;
import com.my.designpattern.designpattern.AbstractFactory.ChildsOfmobile.iPhone;
import com.my.designpattern.designpattern.AbstractFactory.ChildsOfpc.iMac;
import com.my.designpattern.designpattern.AbstractFactory.Final.FactoryMobile;
import com.my.designpattern.designpattern.AbstractFactory.Final.FactoryPc;
import com.my.designpattern.designpattern.AbstractFactory.Final.FactoryProducer;
import com.my.designpattern.designpattern.AbstractFactory.Final.abstractfactory;
import com.my.designpattern.designpattern.AbstractFactory.Interface.Mobile;
import com.my.designpattern.designpattern.AbstractFactory.Interface.Pc;
import com.my.designpattern.model.Modelabstractfactory;
import com.my.designpattern.viewmodel.ViewmodelAbstractfactory;

public class AbstractFactoryActivity extends AppCompatActivity {

    private ActivityAbstractFactoryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding= DataBindingUtil.setContentView(this,R.layout.activity_abstract_factory);

        new FactoryProducer(this);
        new FactoryMobile(this);
        new iPhone(this);
        new FactoryPc(this);
        new iMac(this);


        binding.setModelAbstractfactory(new ViewmodelAbstractfactory(new
                Modelabstractfactory("abstract factory Design Pattern")));
        binding.setModelAbstractfactoryClick(new ClickAbstractfactory() {
            @Override
            public void ClickAbstractFactory1() {

                abstractfactory abstractfactory = FactoryProducer.getAbstractfactory(0);
                Mobile mobile = abstractfactory.setMobile(1);
                mobile.displayMobile();
            }

            @Override
            public void ClickAbstractFactory2() {
                abstractfactory abstractfactory= FactoryProducer.getAbstractfactory(1);
                Pc pc=abstractfactory.setPc(0);
                pc.displayPc();
            }
        });



    }
}