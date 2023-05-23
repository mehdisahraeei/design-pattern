package com.my.designpattern.designpattern.Strategy.Makers;

import com.my.designpattern.designpattern.Strategy.Choose2;
import com.my.designpattern.designpattern.Strategy.Languages;

public class Creator2 extends Languages {

    public Creator2() {
        department=new Choose2();
    }
}
