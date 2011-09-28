package jlo.association;

import java.lang.*;
import java.util.List;
import java.util.ArrayList;

public  interface Property<T extends java.lang.Object> extends jlo.association.SingleAssociationEnd<T> {
    public void setValue(T value) ;

    public T getValue() ;

    public T getValueWithParam(T param) ;

    public T getOtherEnd() ;

    public java.util.List<T> getObjects() ;

    public T jlo_association_Property_getOtherEnd() ;

    public java.util.List<T> jlo_association_Property_getObjects() ;

}