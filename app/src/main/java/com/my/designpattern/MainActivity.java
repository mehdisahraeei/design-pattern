package com.my.designpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.content.Intent;
import android.os.Bundle;
import com.my.designpattern.clicks.ClickItempattern1;
import com.my.designpattern.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        //--------------Casting------------------------------------------





        //---------Clicks with ClickListener------------
        binding.setModelMainClick(new ClickItempattern1() {
            @Override
            public void ClickListener1() {
                startActivity(new Intent(MainActivity.this,singletonActivity.class));
            }

            @Override
            public void ClickListener2() {
                startActivity(new Intent(MainActivity.this,BuilderActivity.class));
            }

            @Override
            public void ClickListener3() {
                startActivity(new Intent(MainActivity.this,PrototypeActivity.class));
            }

            @Override
            public void ClickListener4() {
                startActivity(new Intent(MainActivity.this,AbstractFactoryActivity.class));
            }

            @Override
            public void ClickListener5() {
                startActivity(new Intent(MainActivity.this,FactoryActivity.class));
            }

            @Override
            public void ClickListener6() {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }

        });



    }
}