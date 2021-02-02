package com.my.designpattern.designpattern.Strategy.Makers;

import com.my.designpattern.designpattern.Strategy.Choose1;
import com.my.designpattern.designpattern.Strategy.Languages;

public class Creator1 extends Languages {


    public Creator1() {
        department=new Choose1();
    }
}
