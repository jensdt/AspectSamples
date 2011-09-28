package jlo.association;

import java.lang.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public  interface MultiTransitiveAssociationEnd<FROM,MIDDLE,TO> extends jlo.association.AssociationEnd<TO> {
;

    public java.util.List<TO> getObjects() ;

    public java.util.List<TO> jlo_association_MultiTransitiveAssociationEnd_getObjects() ;

    abstract static public  interface jlo_association_MultiTransitiveAssociationEnd_object_constructor {
        abstract public jlo.association.MultiTransitiveAssociationEnd.object construct(java.lang.Object object) ;

    }

    abstract static public  interface jlo_association_MultiTransitiveAssociationEnd_object_constructorFROM<FROM,MIDDLE,TO> {
        abstract public jlo.association.MultiTransitiveAssociationEnd.object construct(java.lang.Object objectafrkuscggfjsdk, FROM value) ;

    }

    public object<FROM,MIDDLE,TO> object__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____object(object<FROM,MIDDLE,TO> object) ;

    public  interface object<FROM,MIDDLE,TO> extends jlo.association.Property<FROM> {
    }

    public FROM object() ;

    public java.util.List<? extends jlo.association.AssociationEnd<MIDDLE>> __select$first(FROM argument) ;

    public java.util.List<? extends jlo.association.AssociationEnd<TO>> __select$second(MIDDLE argument) ;

}