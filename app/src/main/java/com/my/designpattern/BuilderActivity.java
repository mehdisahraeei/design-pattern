package com.my.designpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import com.my.designpattern.clicks.ClickNew2;
import com.my.designpattern.databinding.ActivityBuilderBinding;
import com.my.designpattern.model.ModelBuilder;
import com.my.designpattern.viewmodel.ViewmodelBuilder;

public class BuilderActivity extends AppCompatActivity {

    private ActivityBuilderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_builder);

        binding.setModelBuilder(new ViewmodelBuilder(new ModelBuilder("Builder Design Pattern")));
        binding.setModelBuilderClick(new ClickNew2(this));
    }
}