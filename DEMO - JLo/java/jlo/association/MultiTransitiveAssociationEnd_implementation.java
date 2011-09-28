package jlo.association;

import java.lang.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class MultiTransitiveAssociationEnd_implementation<FROM,MIDDLE,TO> implements jlo.association.AssociationEnd_implementation<TO>, jlo.association.MultiTransitiveAssociationEnd<FROM,MIDDLE,TO> {
     public MultiTransitiveAssociationEnd_implementation(FROM object) {
        super();
        set__component__lkjkberfuncye____object(new object_implementation(object));
    }

;

    public java.util.List<TO> getObjects() {
        java.util.HashSet<TO> result = new java.util.HashSet<TO>();
        java.util.List<? extends jlo.association.AssociationEnd<MIDDLE>> firsts = __select$first(object());
        int size = firsts.size();
        for (int i = 0; (i) < (size); i++) {
            jlo.association.AssociationEnd<MIDDLE> first = firsts.get(i);
            java.util.List<MIDDLE> middles = first.getObjects();
            for (MIDDLE middle: middles) {
                java.util.List<? extends jlo.association.AssociationEnd<TO>> seconds = __select$second(middle);
                jlo.association.AssociationEnd<TO> second = seconds.get(i);
                result.addAll(second.getObjects());
            }
        }
        return new java.util.ArrayList<TO>(result);
    }

    public java.util.List<TO> jlo_association_MultiTransitiveAssociationEnd_getObjects() {
        java.util.HashSet<TO> result = new java.util.HashSet<TO>();
        java.util.List<? extends jlo.association.AssociationEnd<MIDDLE>> firsts = __select$first(object());
        int size = firsts.size();
        for (int i = 0; (i) < (size); i++) {
            jlo.association.AssociationEnd<MIDDLE> first = firsts.get(i);
            java.util.List<MIDDLE> middles = first.getObjects();
            for (MIDDLE middle: middles) {
                java.util.List<? extends jlo.association.AssociationEnd<TO>> seconds = __select$second(middle);
                jlo.association.AssociationEnd<TO> second = seconds.get(i);
                result.addAll(second.getObjects());
            }
        }
        return new java.util.ArrayList<TO>(result);
    }

    abstract static public class jlo_association_MultiTransitiveAssociationEnd_object_constructor_implementation implements jlo.association.MultiTransitiveAssociationEnd.jlo_association_MultiTransitiveAssociationEnd_object_constructor {
        abstract public jlo.association.MultiTransitiveAssociationEnd.object construct(java.lang.Object object) ;

    }

    abstract static public class jlo_association_MultiTransitiveAssociationEnd_object_constructorFROM_implementation<FROM,MIDDLE,TO> implements jlo.association.MultiTransitiveAssociationEnd.jlo_association_MultiTransitiveAssociationEnd_object_constructorFROM<FROM,MIDDLE,TO> {
        abstract public jlo.association.MultiTransitiveAssociationEnd.object construct(java.lang.Object objectafrkuscggfjsdk, FROM value) ;

    }

     public MultiTransitiveAssociationEnd_implementation(FROM object, jlo_association_MultiTransitiveAssociationEnd_object_constructor strategyForjlo_association_MultiTransitiveAssociationEnd_object, jlo_association_MultiTransitiveAssociationEnd_object_constructorFROM defaultstrategyForjlo_association_MultiTransitiveAssociationEnd_object) {
        super();
        if((strategyForjlo_association_MultiTransitiveAssociationEnd_object) == (null)) {
            if((defaultstrategyForjlo_association_MultiTransitiveAssociationEnd_object) == (null)) {
                set__component__lkjkberfuncye____object(new object_implementation(object));
            }
            else {
                set__component__lkjkberfuncye____object(defaultstrategyForjlo_association_MultiTransitiveAssociationEnd_object.construct(this, object));
            }
        }
        else {
            set__component__lkjkberfuncye____object(strategyForjlo_association_MultiTransitiveAssociationEnd_object.construct(this));
        }
    }

    public object<FROM,MIDDLE,TO> object__component__lkjkberfuncye__() {
        return object;
    }

    public void set__component__lkjkberfuncye____object(object<FROM,MIDDLE,TO> object) {
        this.object = object;
    }

    public class object_implementation extends jlo.association.Property_implementation<FROM> implements jlo.association.MultiTransitiveAssociationEnd.object<FROM,MIDDLE,TO> {
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

    public java.util.List<? extends jlo.association.AssociationEnd<MIDDLE>> __select$first(FROM argument) {
        throw new java.lang.Error();
    }

    public java.util.List<? extends jlo.association.AssociationEnd<TO>> __select$second(MIDDLE argument) {
        throw new java.lang.Error();
    }

}