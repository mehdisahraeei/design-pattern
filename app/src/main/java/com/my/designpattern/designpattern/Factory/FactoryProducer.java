package com.my.designpattern.designpattern.Factory;

public class FactoryProducer {

    public Media setMedia(String WhichMedia)
    {
        if (WhichMedia=="film")
        {
            return new Film();
        }
        else if (WhichMedia=="music")
        {
            return new Music();
        }
        return null;
    }

}
