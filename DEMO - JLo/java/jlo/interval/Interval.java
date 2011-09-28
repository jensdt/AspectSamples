package jlo.interval;

import java.lang.*;
import java.util.Comparator;
import jlo.association.Property;
import java.util.List;
import java.util.ArrayList;

public  interface Interval<T extends java.lang.Comparable<T>> {
    abstract static public  interface jlo_interval_Interval_upperBound_constructor {
        abstract public jlo.interval.Interval.upperBound construct(java.lang.Object object) ;

    }

    abstract static public  interface jlo_interval_Interval_upperBound_constructorTboolean<T extends java.lang.Comparable<T>> {
        abstract public jlo.interval.Interval.upperBound construct(java.lang.Object objectafrkuscggfjsdk, T value, boolean notUsed) ;

    }

    abstract static public  interface jlo_interval_Interval_value_constructor {
        abstract public jlo.interval.Interval.value construct(java.lang.Object object) ;

    }

    abstract static public  interface jlo_interval_Interval_value_constructorTboolean<T extends java.lang.Comparable<T>> {
        abstract public jlo.interval.Interval.value construct(java.lang.Object objectafrkuscggfjsdk, T value, boolean notUsed) ;

    }

    abstract static public  interface jlo_interval_Interval_lowerBound_constructor {
        abstract public jlo.interval.Interval.lowerBound construct(java.lang.Object object) ;

    }

    abstract static public  interface jlo_interval_Interval_lowerBound_constructorTboolean<T extends java.lang.Comparable<T>> {
        abstract public jlo.interval.Interval.lowerBound construct(java.lang.Object objectafrkuscggfjsdk, T value, boolean notUsed) ;

    }

    public upperBound<T> upperBound__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____upperBound(upperBound<T> upperBound) ;

    public  interface upperBound<T extends java.lang.Comparable<T>> extends jlo.association.Property<T> {
        public void setValue(T upper) ;

        public void jlo_interval_Interval_upperBound_setValue(T upper) ;

    }

    public void setUpperBound(T upper) ;

    public T upperBound() ;

    public value<T> value__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____value(value<T> value) ;

    public  interface value<T extends java.lang.Comparable<T>> extends jlo.association.Property<T> {
        public void setValue(T val) ;

        public void jlo_interval_Interval_value_setValue(T val) ;

    }

    public void setValue(T val) ;

    public T value() ;

    public lowerBound<T> lowerBound__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____lowerBound(lowerBound<T> lowerBound) ;

    public  interface lowerBound<T extends java.lang.Comparable<T>> extends jlo.association.Property<T> {
        public void setValue(T lower) ;

        public void jlo_interval_Interval_lowerBound_setValue(T lower) ;

    }

    public void setLowerBound(T lower) ;

    public T lowerBound() ;

}