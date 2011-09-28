package jlo.tuple;

import java.lang.*;
import jlo.association.Property;
import java.util.List;
import java.util.ArrayList;

public class Pair_implementation<L,R> extends java.lang.Object implements jlo.tuple.Pair<L,R> {
     public Pair_implementation(L l, R r) {
        super();
        set__component__lkjkberfuncye____left(new left_implementation(l));
        set__component__lkjkberfuncye____right(new right_implementation(r));
    }

;

;

    abstract static public class jlo_tuple_Pair_left_constructor_implementation implements jlo.tuple.Pair.jlo_tuple_Pair_left_constructor {
        abstract public jlo.tuple.Pair.left construct(java.lang.Object object) ;

    }

    abstract static public class jlo_tuple_Pair_left_constructorL_implementation<L,R> implements jlo.tuple.Pair.jlo_tuple_Pair_left_constructorL<L,R> {
        abstract public jlo.tuple.Pair.left construct(java.lang.Object objectafrkuscggfjsdk, L value) ;

    }

    abstract static public class jlo_tuple_Pair_right_constructor_implementation implements jlo.tuple.Pair.jlo_tuple_Pair_right_constructor {
        abstract public jlo.tuple.Pair.right construct(java.lang.Object object) ;

    }

    abstract static public class jlo_tuple_Pair_right_constructorR_implementation<L,R> implements jlo.tuple.Pair.jlo_tuple_Pair_right_constructorR<L,R> {
        abstract public jlo.tuple.Pair.right construct(java.lang.Object objectafrkuscggfjsdk, R value) ;

    }

     public Pair_implementation(L l, R r, jlo_tuple_Pair_left_constructor strategyForjlo_tuple_Pair_left, jlo_tuple_Pair_left_constructorL defaultstrategyForjlo_tuple_Pair_left, jlo_tuple_Pair_right_constructor strategyForjlo_tuple_Pair_right, jlo_tuple_Pair_right_constructorR defaultstrategyForjlo_tuple_Pair_right) {
        super();
        if((strategyForjlo_tuple_Pair_left) == (null)) {
            if((defaultstrategyForjlo_tuple_Pair_left) == (null)) {
                set__component__lkjkberfuncye____left(new left_implementation(l));
            }
            else {
                set__component__lkjkberfuncye____left(defaultstrategyForjlo_tuple_Pair_left.construct(this, l));
            }
        }
        else {
            set__component__lkjkberfuncye____left(strategyForjlo_tuple_Pair_left.construct(this));
        }
        if((strategyForjlo_tuple_Pair_right) == (null)) {
            if((defaultstrategyForjlo_tuple_Pair_right) == (null)) {
                set__component__lkjkberfuncye____right(new right_implementation(r));
            }
            else {
                set__component__lkjkberfuncye____right(defaultstrategyForjlo_tuple_Pair_right.construct(this, r));
            }
        }
        else {
            set__component__lkjkberfuncye____right(strategyForjlo_tuple_Pair_right.construct(this));
        }
    }

    public left<L,R> left__component__lkjkberfuncye__() {
        return left;
    }

    public void set__component__lkjkberfuncye____left(left<L,R> left) {
        this.left = left;
    }

    public class left_implementation extends jlo.association.Property_implementation<L> implements jlo.tuple.Pair.left<L,R> {
         public left_implementation(L value) {
            super(value);
        }

         public left_implementation(L value, boolean notUsed) {
            super(value, notUsed);
        }

    }

    public L left() {
        return left__component__lkjkberfuncye__().getValue();
    }

    public right<L,R> right__component__lkjkberfuncye__() {
        return right;
    }

    public void set__component__lkjkberfuncye____right(right<L,R> right) {
        this.right = right;
    }

    public class right_implementation extends jlo.association.Property_implementation<R> implements jlo.tuple.Pair.right<L,R> {
         public right_implementation(R value) {
            super(value);
        }

         public right_implementation(R value, boolean notUsed) {
            super(value, notUsed);
        }

    }

    public R right() {
        return right__component__lkjkberfuncye__().getValue();
    }

    public left<L,R> left;

    public right<L,R> right;

}