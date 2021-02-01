package com.my.designpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.content.Intent;
import android.os.Bundle;
import com.my.designpattern.clicks.ClickItempattern2;
import com.my.designpattern.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main2);

        binding.setModelMain2Click(new ClickItempattern2() {
            @Override
            public void ClickListener1() {
                startActivity(new Intent(MainActivity2.this,FacadeActivity.class));
            }
        });



    }
}