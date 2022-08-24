package com.my.designpattern.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;

import com.my.designpattern.R;
import com.my.designpattern.clicks.ClickStrategy;
import com.my.designpattern.databinding.ActivityStrategyBinding;
import com.my.designpattern.model.ModelStrategy;
import com.my.designpattern.viewmodel.ViewmodelStrategy;

public class StrategyActivity extends AppCompatActivity {

    private ActivityStrategyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_strategy);
        binding.setModelStrategy(new ViewmodelStrategy(new ModelStrategy("Strategy Design Pattern")));
        binding.setModelStrategyClick(new ClickStrategy(this));
    }
}