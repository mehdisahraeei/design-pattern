package com.my.designpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import com.my.designpattern.clicks.ClickProtoType;
import com.my.designpattern.databinding.ActivityPrototypeBinding;
import com.my.designpattern.model.ModelProtoType;
import com.my.designpattern.viewmodel.ViewmodelProtoType;

public class PrototypeActivity extends AppCompatActivity {

    private ActivityPrototypeBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_prototype);

        binding.setModelProtoType(new ViewmodelProtoType(new ModelProtoType("ProtoType Design Pattern")));
        binding.setModelProtoTypeClick(new ClickProtoType(this));

    }
}