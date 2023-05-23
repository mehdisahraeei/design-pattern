package com.my.designpattern.designpattern;

public class Singleton {

    private static Singleton instance;
    private String text;

    private Singleton() {
    }

    public static Singleton getInstance()
    {
        if (instance==null)
        {
            instance=new Singleton();
        }
        return instance;
    }

    public String setT(String text)
    {
        return text;
    }

}
