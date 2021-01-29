package com.my.designpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import com.my.designpattern.clicks.ClickNew1;
import com.my.designpattern.databinding.ActivitySingletonBinding;
import com.my.designpattern.model.Modelsingleton;
import com.my.designpattern.viewmodel.Viewmodelsingleton;

public class singletonActivity extends AppCompatActivity {

    private ActivitySingletonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_singleton);
        //--------------Casting------------------------------------------


        binding.setModelSingleton(new Viewmodelsingleton(new Modelsingleton("Singleton Design Pattern")));
        binding.setModelSingletonClick(new ClickNew1(this));



    }

}