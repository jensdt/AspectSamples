package example.cityroad;

import java.lang.*;
import jlo.association.WiredSingleAssociationEnd;
import jlo.association.Property;
import java.util.List;
import java.util.ArrayList;

public class Road_implementation extends java.lang.Object implements example.cityroad.Road {
     public Road_implementation(java.lang.Double length) {
        super();
        set__component__lkjkberfuncye____length(new length_implementation(length));
        set__component__lkjkberfuncye____start(new start_implementation(this));
        set__component__lkjkberfuncye____end(new end_implementation(this));
    }

     public Road_implementation(java.lang.Double length, example.cityroad.City first, example.cityroad.City second) {
        super();
        set__component__lkjkberfuncye____length(new length_implementation(length));
        set__component__lkjkberfuncye____start(new start_implementation(this));
        set__component__lkjkberfuncye____end(new end_implementation(this));
        setStart(first);
        setEnd(second);
    }

;

;

;

    abstract static public class example_cityroad_Road_length_constructor_implementation implements example.cityroad.Road.example_cityroad_Road_length_constructor {
        abstract public example.cityroad.Road.length construct(java.lang.Object object) ;

    }

    abstract static public class example_cityroad_Road_length_constructorDouble_implementation implements example.cityroad.Road.example_cityroad_Road_length_constructorDouble {
        abstract public example.cityroad.Road.length construct(java.lang.Object objectafrkuscggfjsdk, java.lang.Double value) ;

    }

    abstract static public class example_cityroad_Road_start_constructor_implementation implements example.cityroad.Road.example_cityroad_Road_start_constructor {
        abstract public example.cityroad.Road.start construct(java.lang.Object object) ;

    }

    abstract static public class example_cityroad_Road_start_constructorRoad_implementation implements example.cityroad.Road.example_cityroad_Road_start_constructorRoad {
        abstract public example.cityroad.Road.start construct(java.lang.Object objectafrkuscggfjsdk, example.cityroad.Road object) ;

    }

    abstract static public class example_cityroad_Road_end_constructor_implementation implements example.cityroad.Road.example_cityroad_Road_end_constructor {
        abstract public example.cityroad.Road.end construct(java.lang.Object object) ;

    }

    abstract static public class example_cityroad_Road_end_constructorRoad_implementation implements example.cityroad.Road.example_cityroad_Road_end_constructorRoad {
        abstract public example.cityroad.Road.end construct(java.lang.Object objectafrkuscggfjsdk, example.cityroad.Road object) ;

    }

     public Road_implementation(java.lang.Double length, example_cityroad_Road_length_constructor strategyForexample_cityroad_Road_length, example_cityroad_Road_length_constructorDouble defaultstrategyForexample_cityroad_Road_length, example_cityroad_Road_start_constructor strategyForexample_cityroad_Road_start, example_cityroad_Road_start_constructorRoad defaultstrategyForexample_cityroad_Road_start, example_cityroad_Road_end_constructor strategyForexample_cityroad_Road_end, example_cityroad_Road_end_constructorRoad defaultstrategyForexample_cityroad_Road_end) {
        super();
        if((strategyForexample_cityroad_Road_length) == (null)) {
            if((defaultstrategyForexample_cityroad_Road_length) == (null)) {
                set__component__lkjkberfuncye____length(new length_implementation(length));
            }
            else {
                set__component__lkjkberfuncye____length(defaultstrategyForexample_cityroad_Road_length.construct(this, length));
            }
        }
        else {
            set__component__lkjkberfuncye____length(strategyForexample_cityroad_Road_length.construct(this));
        }
        if((strategyForexample_cityroad_Road_start) == (null)) {
            if((defaultstrategyForexample_cityroad_Road_start) == (null)) {
                set__component__lkjkberfuncye____start(new start_implementation(this));
            }
            else {
                set__component__lkjkberfuncye____start(defaultstrategyForexample_cityroad_Road_start.construct(this, this));
            }
        }
        else {
            set__component__lkjkberfuncye____start(strategyForexample_cityroad_Road_start.construct(this));
        }
        if((strategyForexample_cityroad_Road_end) == (null)) {
            if((defaultstrategyForexample_cityroad_Road_end) == (null)) {
                set__component__lkjkberfuncye____end(new end_implementation(this));
            }
            else {
                set__component__lkjkberfuncye____end(defaultstrategyForexample_cityroad_Road_end.construct(this, this));
            }
        }
        else {
            set__component__lkjkberfuncye____end(strategyForexample_cityroad_Road_end.construct(this));
        }
    }

     public Road_implementation(java.lang.Double length, example.cityroad.City first, example.cityroad.City second, example_cityroad_Road_length_constructor strategyForexample_cityroad_Road_length, example_cityroad_Road_length_constructorDouble defaultstrategyForexample_cityroad_Road_length, example_cityroad_Road_start_constructor strategyForexample_cityroad_Road_start, example_cityroad_Road_start_constructorRoad defaultstrategyForexample_cityroad_Road_start, example_cityroad_Road_end_constructor strategyForexample_cityroad_Road_end, example_cityroad_Road_end_constructorRoad defaultstrategyForexample_cityroad_Road_end) {
        super();
        if((strategyForexample_cityroad_Road_length) == (null)) {
            if((defaultstrategyForexample_cityroad_Road_length) == (null)) {
                set__component__lkjkberfuncye____length(new length_implementation(length));
            }
            else {
                set__component__lkjkberfuncye____length(defaultstrategyForexample_cityroad_Road_length.construct(this, length));
            }
        }
        else {
            set__component__lkjkberfuncye____length(strategyForexample_cityroad_Road_length.construct(this));
        }
        if((strategyForexample_cityroad_Road_start) == (null)) {
            if((defaultstrategyForexample_cityroad_Road_start) == (null)) {
                set__component__lkjkberfuncye____start(new start_implementation(this));
            }
            else {
                set__component__lkjkberfuncye____start(defaultstrategyForexample_cityroad_Road_start.construct(this, this));
            }
        }
        else {
            set__component__lkjkberfuncye____start(strategyForexample_cityroad_Road_start.construct(this));
        }
        if((strategyForexample_cityroad_Road_end) == (null)) {
            if((defaultstrategyForexample_cityroad_Road_end) == (null)) {
                set__component__lkjkberfuncye____end(new end_implementation(this));
            }
            else {
                set__component__lkjkberfuncye____end(defaultstrategyForexample_cityroad_Road_end.construct(this, this));
            }
        }
        else {
            set__component__lkjkberfuncye____end(strategyForexample_cityroad_Road_end.construct(this));
        }
        setStart(first);
        setEnd(second);
    }

    public length length__component__lkjkberfuncye__() {
        return length;
    }

    public void set__component__lkjkberfuncye____length(length length) {
        this.length = length;
    }

    public class length_implementation extends jlo.association.Property_implementation<java.lang.Double> implements example.cityroad.Road.length {
         public length_implementation(java.lang.Double value) {
            super(value);
        }

         public length_implementation(java.lang.Double value, boolean notUsed) {
            super(value, notUsed);
        }

    }

    public java.lang.Double length() {
        return length__component__lkjkberfuncye__().getValue();
    }

    public start start__component__lkjkberfuncye__() {
        return start;
    }

    public void set__component__lkjkberfuncye____start(start start) {
        this.start = start;
    }

    public class start_implementation extends jlo.association.WiredSingleAssociationEnd_implementation<example.cityroad.Road,example.cityroad.City> implements example.cityroad.Road.start {
        public jlo.association.BidiAssociationEnd<example.cityroad.City,example.cityroad.Road> __select$otherEnd(example.cityroad.City argument) {
            return argument.outgoing__component__lkjkberfuncye__();
        }

         public start_implementation(example.cityroad.Road object) {
            super(object);
        }

    }

    public void setStart(example.cityroad.City to) {
        start__component__lkjkberfuncye__().connect(to);
    }

    public example.cityroad.City start() {
        return start__component__lkjkberfuncye__().getOtherEnd();
    }

    public end end__component__lkjkberfuncye__() {
        return end;
    }

    public void set__component__lkjkberfuncye____end(end end) {
        this.end = end;
    }

    public class end_implementation extends jlo.association.WiredSingleAssociationEnd_implementation<example.cityroad.Road,example.cityroad.City> implements example.cityroad.Road.end {
        public jlo.association.BidiAssociationEnd<example.cityroad.City,example.cityroad.Road> __select$otherEnd(example.cityroad.City argument) {
            return argument.incoming__component__lkjkberfuncye__();
        }

         public end_implementation(example.cityroad.Road object) {
            super(object);
        }

    }

    public void setEnd(example.cityroad.City to) {
        end__component__lkjkberfuncye__().connect(to);
    }

    public example.cityroad.City end() {
        return end__component__lkjkberfuncye__().getOtherEnd();
    }

    public length length;

    public start start;

    public end end;

}