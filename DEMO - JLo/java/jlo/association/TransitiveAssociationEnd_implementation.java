package jlo.association;

import java.lang.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import jlo.association.Property;

public class TransitiveAssociationEnd_implementation<FROM,MIDDLE,TO> implements jlo.association.AssociationEnd_implementation<TO>, jlo.association.TransitiveAssociationEnd<FROM,MIDDLE,TO> {
     public TransitiveAssociationEnd_implementation(FROM object) {
        super();
        set__component__lkjkberfuncye____object(new object_implementation(object));
    }

;

    public java.util.List<TO> getObjects() {
        java.util.List<MIDDLE> middles = edges();
        java.util.HashSet<TO> result = new java.util.HashSet<TO>();
        for (MIDDLE middle: middles) {
            result.addAll(__select$second(middle).getObjects());
        }
        return new java.util.ArrayList<TO>(result);
    }

    public java.util.List<MIDDLE> edges() {
        return __select$first(object()).getObjects();
    }

    public java.util.List<TO> otherEnds(MIDDLE middle) {
        return __select$second(middle).getObjects();
    }

    public java.util.List<TO> jlo_association_TransitiveAssociationEnd_getObjects() {
        java.util.List<MIDDLE> middles = edges();
        java.util.HashSet<TO> result = new java.util.HashSet<TO>();
        for (MIDDLE middle: middles) {
            result.addAll(__select$second(middle).getObjects());
        }
        return new java.util.ArrayList<TO>(result);
    }

    abstract static public class jlo_association_TransitiveAssociationEnd_object_constructor_implementation implements jlo.association.TransitiveAssociationEnd.jlo_association_TransitiveAssociationEnd_object_constructor {
        abstract public jlo.association.TransitiveAssociationEnd.object construct(java.lang.Object object) ;

    }

    abstract static public class jlo_association_TransitiveAssociationEnd_object_constructorFROM_implementation<FROM,MIDDLE,TO> implements jlo.association.TransitiveAssociationEnd.jlo_association_TransitiveAssociationEnd_object_constructorFROM<FROM,MIDDLE,TO> {
        abstract public jlo.association.TransitiveAssociationEnd.object construct(java.lang.Object objectafrkuscggfjsdk, FROM value) ;

    }

     public TransitiveAssociationEnd_implementation(FROM object, jlo_association_TransitiveAssociationEnd_object_constructor strategyForjlo_association_TransitiveAssociationEnd_object, jlo_association_TransitiveAssociationEnd_object_constructorFROM defaultstrategyForjlo_association_TransitiveAssociationEnd_object) {
        super();
        if((strategyForjlo_association_TransitiveAssociationEnd_object) == (null)) {
            if((defaultstrategyForjlo_association_TransitiveAssociationEnd_object) == (null)) {
                set__component__lkjkberfuncye____object(new object_implementation(object));
            }
            else {
                set__component__lkjkberfuncye____object(defaultstrategyForjlo_association_TransitiveAssociationEnd_object.construct(this, object));
            }
        }
        else {
            set__component__lkjkberfuncye____object(strategyForjlo_association_TransitiveAssociationEnd_object.construct(this));
        }
    }

    public object<FROM,MIDDLE,TO> object__component__lkjkberfuncye__() {
        return object;
    }

    public void set__component__lkjkberfuncye____object(object<FROM,MIDDLE,TO> object) {
        this.object = object;
    }

    public class object_implementation extends jlo.association.Property_implementation<FROM> implements jlo.association.TransitiveAssociationEnd.object<FROM,MIDDLE,TO> {
         public object_implementation(FROM value) {
            super(value);
        }

         public object_implementation(FROM value, boolean notUsed) {
            super(value, notUsed);
        }

    }

    public FROM object() {
        return object__component__lkjkberfuncye__().getValue();
    }

    public object<FROM,MIDDLE,TO> object;

    public jlo.association.AssociationEnd<MIDDLE> __select$first(FROM argument) {
        throw new java.lang.Error();
    }

    public jlo.association.AssociationEnd<TO> __select$second(MIDDLE argument) {
        throw new java.lang.Error();
    }

}