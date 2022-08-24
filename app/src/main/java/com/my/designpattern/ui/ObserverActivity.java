package com.my.designpattern.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;

import com.my.designpattern.R;
import com.my.designpattern.clicks.Clickobserver;
import com.my.designpattern.databinding.ActivityObserverBinding;
import com.my.designpattern.model.Modelobserver;
import com.my.designpattern.viewmodel.Viewmodelobserver;

public class ObserverActivity extends AppCompatActivity {

    private ActivityObserverBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_observer);
        binding.setModelobserver(new Viewmodelobserver(new Modelobserver("Observer Design Pattern")));
        binding.setModelobserverClick(new Clickobserver(this));
    }
}