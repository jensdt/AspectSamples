package jlo.association;

import java.lang.*;
import java.util.List;
import java.util.ArrayList;

public  interface MultiProperty<T extends java.lang.Object> extends jlo.association.AssociationEnd<T> {
    public boolean isFrugal() ;

    public void add(T value) ;

    public boolean isValid(T value) ;

    public void remove(T value) ;

    public java.util.List<T> getObjects() ;

    public java.util.List<T> jlo_association_MultiProperty_getObjects() ;

}