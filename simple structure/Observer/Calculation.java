package com.my.designpattern.designpattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Calculation implements Subject{


    private int x,y;
    private List list;

    public Calculation() {
        list=new ArrayList();
    }

    @Override
    public void Register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void Remove(Observer observer) {
        int i = list.indexOf(observer);
        if (i >= 0)
        {
            list.remove(i);
        }
    }

    @Override
    public void Holder() {
        for (int i=0;i<list.size();i++)
        {
            Observer observer=(Observer)list.get(i);
            observer.update(x,y);
        }
    }


    public void setParametr(int x,int y)
    {
        this.x=x;
        this.y=y;
        Holder();
    }

}
