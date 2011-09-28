package example.cityroad;

import java.lang.*;
import jlo.association.WiredSingleAssociationEnd;
import jlo.association.Property;
import java.util.List;
import java.util.ArrayList;

public  interface Road {
;

;

;

    abstract static public  interface example_cityroad_Road_length_constructor {
        abstract public example.cityroad.Road.length construct(java.lang.Object object) ;

    }

    abstract static public  interface example_cityroad_Road_length_constructorDouble {
        abstract public example.cityroad.Road.length construct(java.lang.Object objectafrkuscggfjsdk, java.lang.Double value) ;

    }

    abstract static public  interface example_cityroad_Road_start_constructor {
        abstract public example.cityroad.Road.start construct(java.lang.Object object) ;

    }

    abstract static public  interface example_cityroad_Road_start_constructorRoad {
        abstract public example.cityroad.Road.start construct(java.lang.Object objectafrkuscggfjsdk, example.cityroad.Road object) ;

    }

    abstract static public  interface example_cityroad_Road_end_constructor {
        abstract public example.cityroad.Road.end construct(java.lang.Object object) ;

    }

    abstract static public  interface example_cityroad_Road_end_constructorRoad {
        abstract public example.cityroad.Road.end construct(java.lang.Object objectafrkuscggfjsdk, example.cityroad.Road object) ;

    }

    public length length__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____length(length length) ;

    public  interface length extends jlo.association.Property<java.lang.Double> {
    }

    public java.lang.Double length() ;

    public start start__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____start(start start) ;

    public  interface start extends jlo.association.WiredSingleAssociationEnd<example.cityroad.Road,example.cityroad.City> {
        public jlo.association.BidiAssociationEnd<example.cityroad.City,example.cityroad.Road> __select$otherEnd(example.cityroad.City argument) ;

    }

    public void setStart(example.cityroad.City to) ;

    public example.cityroad.City start() ;

    public end end__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____end(end end) ;

    public  interface end extends jlo.association.WiredSingleAssociationEnd<example.cityroad.Road,example.cityroad.City> {
        public jlo.association.BidiAssociationEnd<example.cityroad.City,example.cityroad.Road> __select$otherEnd(example.cityroad.City argument) ;

    }

    public void setEnd(example.cityroad.City to) ;

    public example.cityroad.City end() ;

}