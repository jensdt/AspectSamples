package jlo.interval;

import java.lang.*;
import java.util.Comparator;
import jlo.association.Property;
import java.util.List;
import java.util.ArrayList;

public class Interval_implementation<T extends java.lang.Comparable<T>> extends java.lang.Object implements jlo.interval.Interval<T> {
     public Interval_implementation(T lower, T value, T upper) {
        super();
        if((((value.compareTo(lower)) < (0) || (value.compareTo(upper)) > (0)) || (lower.compareTo(upper)) > (0))) {
            throw new java.lang.IllegalArgumentException();
        }
        set__component__lkjkberfuncye____lowerBound(new lowerBound_implementation(lower, false));
        set__component__lkjkberfuncye____upperBound(new upperBound_implementation(upper, false));
        set__component__lkjkberfuncye____value(new value_implementation(value, false));
    }

    abstract static public class jlo_interval_Interval_upperBound_constructor_implementation implements jlo.interval.Interval.jlo_interval_Interval_upperBound_constructor {
        abstract public jlo.interval.Interval.upperBound construct(java.lang.Object object) ;

    }

    abstract static public class jlo_interval_Interval_upperBound_constructorTboolean_implementation<T extends java.lang.Comparable<T>> implements jlo.interval.Interval.jlo_interval_Interval_upperBound_constructorTboolean<T> {
        abstract public jlo.interval.Interval.upperBound construct(java.lang.Object objectafrkuscggfjsdk, T value, boolean notUsed) ;

    }

    abstract static public class jlo_interval_Interval_value_constructor_implementation implements jlo.interval.Interval.jlo_interval_Interval_value_constructor {
        abstract public jlo.interval.Interval.value construct(java.lang.Object object) ;

    }

    abstract static public class jlo_interval_Interval_value_constructorTboolean_implementation<T extends java.lang.Comparable<T>> implements jlo.interval.Interval.jlo_interval_Interval_value_constructorTboolean<T> {
        abstract public jlo.interval.Interval.value construct(java.lang.Object objectafrkuscggfjsdk, T value, boolean notUsed) ;

    }

    abstract static public class jlo_interval_Interval_lowerBound_constructor_implementation implements jlo.interval.Interval.jlo_interval_Interval_lowerBound_constructor {
        abstract public jlo.interval.Interval.lowerBound construct(java.lang.Object object) ;

    }

    abstract static public class jlo_interval_Interval_lowerBound_constructorTboolean_implementation<T extends java.lang.Comparable<T>> implements jlo.interval.Interval.jlo_interval_Interval_lowerBound_constructorTboolean<T> {
        abstract public jlo.interval.Interval.lowerBound construct(java.lang.Object objectafrkuscggfjsdk, T value, boolean notUsed) ;

    }

     public Interval_implementation(T lower, T value, T upper, jlo_interval_Interval_upperBound_constructor strategyForjlo_interval_Interval_upperBound, jlo_interval_Interval_upperBound_constructorTboolean defaultstrategyForjlo_interval_Interval_upperBound, jlo_interval_Interval_value_constructor strategyForjlo_interval_Interval_value, jlo_interval_Interval_value_constructorTboolean defaultstrategyForjlo_interval_Interval_value, jlo_interval_Interval_lowerBound_constructor strategyForjlo_interval_Interval_lowerBound, jlo_interval_Interval_lowerBound_constructorTboolean defaultstrategyForjlo_interval_Interval_lowerBound) {
        super();
        if((((value.compareTo(lower)) < (0) || (value.compareTo(upper)) > (0)) || (lower.compareTo(upper)) > (0))) {
            throw new java.lang.IllegalArgumentException();
        }
        if((strategyForjlo_interval_Interval_lowerBound) == (null)) {
            if((defaultstrategyForjlo_interval_Interval_lowerBound) == (null)) {
                set__component__lkjkberfuncye____lowerBound(new lowerBound_implementation(lower, false));
            }
            else {
                set__component__lkjkberfuncye____lowerBound(defaultstrategyForjlo_interval_Interval_lowerBound.construct(this, lower, false));
            }
        }
        else {
            set__component__lkjkberfuncye____lowerBound(strategyForjlo_interval_Interval_lowerBound.construct(this));
        }
        if((strategyForjlo_interval_Interval_upperBound) == (null)) {
            if((defaultstrategyForjlo_interval_Interval_upperBound) == (null)) {
                set__component__lkjkberfuncye____upperBound(new upperBound_implementation(upper, false));
            }
            else {
                set__component__lkjkberfuncye____upperBound(defaultstrategyForjlo_interval_Interval_upperBound.construct(this, upper, false));
            }
        }
        else {
            set__component__lkjkberfuncye____upperBound(strategyForjlo_interval_Interval_upperBound.construct(this));
        }
        if((strategyForjlo_interval_Interval_value) == (null)) {
            if((defaultstrategyForjlo_interval_Interval_value) == (null)) {
                set__component__lkjkberfuncye____value(new value_implementation(value, false));
            }
            else {
                set__component__lkjkberfuncye____value(defaultstrategyForjlo_interval_Interval_value.construct(this, value, false));
            }
        }
        else {
            set__component__lkjkberfuncye____value(strategyForjlo_interval_Interval_value.construct(this));
        }
    }

    public upperBound<T> upperBound__component__lkjkberfuncye__() {
        return upperBound;
    }

    public void set__component__lkjkberfuncye____upperBound(upperBound<T> upperBound) {
        this.upperBound = upperBound;
    }

    public class upperBound_implementation extends jlo.association.Property_implementation<T> implements jlo.interval.Interval.upperBound<T> {
         public upperBound_implementation(T value) {
            super(value);
        }

         public upperBound_implementation(T value, boolean notUsed) {
            super(value, notUsed);
        }

        public void setValue(T upper) {
            if((upper.compareTo(Interval_implementation.this.value())) >= (0)) {
                super.setValue(upper);
            }
        }

        public void jlo_interval_Interval_upperBound_setValue(T upper) {
            if((upper.compareTo(Interval_implementation.this.value())) >= (0)) {
                super.setValue(upper);
            }
        }

    }

    public void setUpperBound(T upper) {
        upperBound__component__lkjkberfuncye__().setValue(upper);
    }

    public T upperBound() {
        return upperBound__component__lkjkberfuncye__().getValue();
    }

    public value<T> value__component__lkjkberfuncye__() {
        return value;
    }

    public void set__component__lkjkberfuncye____value(value<T> value) {
        this.value = value;
    }

    public class value_implementation extends jlo.association.Property_implementation<T> implements jlo.interval.Interval.value<T> {
         public value_implementation(T value) {
            super(value);
        }

         public value_implementation(T value, boolean notUsed) {
            super(value, notUsed);
        }

        public void setValue(T val) {
            if(((val.compareTo(Interval_implementation.this.upperBound())) <= (0) && (val.compareTo(Interval_implementation.this.lowerBound())) >= (0))) {
                super.setValue(val);
            }
        }

        public void jlo_interval_Interval_value_setValue(T val) {
            if(((val.compareTo(Interval_implementation.this.upperBound())) <= (0) && (val.compareTo(Interval_implementation.this.lowerBound())) >= (0))) {
                super.setValue(val);
            }
        }

    }

    public void setValue(T val) {
        value__component__lkjkberfuncye__().setValue(val);
    }

    public T value() {
        return value__component__lkjkberfuncye__().getValue();
    }

    public lowerBound<T> lowerBound__component__lkjkberfuncye__() {
        return lowerBound;
    }

    public void set__component__lkjkberfuncye____lowerBound(lowerBound<T> lowerBound) {
        this.lowerBound = lowerBound;
    }

    public class lowerBound_implementation extends jlo.association.Property_implementation<T> implements jlo.interval.Interval.lowerBound<T> {
         public lowerBound_implementation(T value) {
            super(value);
        }

         public lowerBound_implementation(T value, boolean notUsed) {
            super(value, notUsed);
        }

        public void setValue(T lower) {
            if((lower.compareTo(Interval_implementation.this.value())) <= (0)) {
                super.setValue(lower);
            }
        }

        public void jlo_interval_Interval_lowerBound_setValue(T lower) {
            if((lower.compareTo(Interval_implementation.this.value())) <= (0)) {
                super.setValue(lower);
            }
        }

    }

    public void setLowerBound(T lower) {
        lowerBound__component__lkjkberfuncye__().setValue(lower);
    }

    public T lowerBound() {
        return lowerBound__component__lkjkberfuncye__().getValue();
    }

    public upperBound<T> upperBound;

    public value<T> value;

    public lowerBound<T> lowerBound;

}