package com.my.designpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;

import com.my.designpattern.clicks.ClickFacade;
import com.my.designpattern.databinding.ActivityFacadeBinding;
import com.my.designpattern.model.ModelFacade;
import com.my.designpattern.viewmodel.ViewmodelFacade;

public class FacadeActivity extends AppCompatActivity {


    private ActivityFacadeBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_facade);
        binding.setModelFacade(new ViewmodelFacade(new ModelFacade("Facade Design Pattern")));
        binding.setModelFacadeClick(new ClickFacade(this));
    }
}