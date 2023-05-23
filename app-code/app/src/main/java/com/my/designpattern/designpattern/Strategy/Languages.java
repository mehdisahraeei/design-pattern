package com.my.designpattern.designpattern.Strategy;

import com.my.designpattern.designpattern.Strategy.Interface.Departments;

public class Languages {


    public Departments department;

    public void setDepartments(Departments departments)
    {
        department=departments;
    }


    public String printfinal()
    {
        String n=department.PrintSelection();
        return n;
    }


}
