package jlo.tuple;

import java.lang.*;
import jlo.association.Property;
import java.util.List;
import java.util.ArrayList;

public  interface Pair<L,R> {
;

;

    abstract static public  interface jlo_tuple_Pair_left_constructor {
        abstract public jlo.tuple.Pair.left construct(java.lang.Object object) ;

    }

    abstract static public  interface jlo_tuple_Pair_left_constructorL<L,R> {
        abstract public jlo.tuple.Pair.left construct(java.lang.Object objectafrkuscggfjsdk, L value) ;

    }

    abstract static public  interface jlo_tuple_Pair_right_constructor {
        abstract public jlo.tuple.Pair.right construct(java.lang.Object object) ;

    }

    abstract static public  interface jlo_tuple_Pair_right_constructorR<L,R> {
        abstract public jlo.tuple.Pair.right construct(java.lang.Object objectafrkuscggfjsdk, R value) ;

    }

    public left<L,R> left__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____left(left<L,R> left) ;

    public  interface left<L,R> extends jlo.association.Property<L> {
    }

    public L left() ;

    public right<L,R> right__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____right(right<L,R> right) ;

    public  interface right<L,R> extends jlo.association.Property<R> {
    }

    public R right() ;

}