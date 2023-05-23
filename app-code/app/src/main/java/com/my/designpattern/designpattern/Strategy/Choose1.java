package com.my.designpattern.designpattern.Strategy;

import com.my.designpattern.designpattern.Strategy.Interface.Departments;

public class Choose1 implements Departments {
    @Override
    public String PrintSelection() {
        return "First way";
    }
}
