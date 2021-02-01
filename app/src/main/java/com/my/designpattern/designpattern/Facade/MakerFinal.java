package com.my.designpattern.designpattern.Facade;

public class MakerFinal {

    private Junior junior;
    private Senior senior;

    public MakerFinal()
    {
        junior=new Junior();
        senior=new Senior();
    }


    public String DisplayOne()
    {
        String s1=junior.PrintProgramingLevels("junior");
        return s1;
    }


    public String DisplayTwo()
    {
        String s2=senior.PrintProgramingLevels("senior");
        return s2;
    }



}
