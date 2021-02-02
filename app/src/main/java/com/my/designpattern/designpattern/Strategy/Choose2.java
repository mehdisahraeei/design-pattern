package com.my.designpattern.designpattern.Strategy;

import com.my.designpattern.designpattern.Strategy.Interface.Departments;

public class Choose2 implements Departments {
    @Override
    public String PrintSelection() {
        return "secound way";
    }
}
