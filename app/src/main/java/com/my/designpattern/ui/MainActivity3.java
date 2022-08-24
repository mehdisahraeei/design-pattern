package com.my.designpattern.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.content.Intent;
import android.os.Bundle;

import com.my.designpattern.R;
import com.my.designpattern.clicks.ClickItempattern3;
import com.my.designpattern.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    private ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main3);
        binding.setModelMain3Click(new ClickItempattern3() {
            @Override
            public void ClickListener1() {
                startActivity(new Intent(MainActivity3.this,StrategyActivity.class));
            }

            @Override
            public void ClickListener2() {
                startActivity(new Intent(MainActivity3.this,ObserverActivity.class));
            }
        });



    }
}