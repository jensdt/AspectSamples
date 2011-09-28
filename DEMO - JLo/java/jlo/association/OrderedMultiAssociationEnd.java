package jlo.association;

import java.lang.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;
import jlo.function.Function;

public  interface OrderedMultiAssociationEnd<FROM,TO> extends jlo.association.AbstractMultiAssociationEnd<FROM,TO> {
    public void remove(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) ;

    public void clear() ;

    public void add(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) ;

    public void addInFront(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) ;

    public void replace(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> oldAssociation, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> newAssociation) ;

    public java.util.List<TO> getObjects() ;

    public TO lastElement() ;

    public TO elementAt(int index) ;

    public java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> getOtherAssociations() ;

    public void unregister(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) ;

    public void unregisterPrivate(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) ;

    public void register(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) ;

    public void registerPrivate(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) ;

    public void registerInFrontPrivate(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) ;

    public boolean registered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> registered) ;

    public boolean unregistered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, final jlo.association.BidiAssociationEnd<? extends TO,? super FROM> unregistered) ;

    public int size() ;

    public boolean contains(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) ;

    public void jlo_association_OrderedMultiAssociationEnd_remove(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) ;

    public void jlo_association_OrderedMultiAssociationEnd_clear() ;

    public void jlo_association_OrderedMultiAssociationEnd_add(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) ;

    public void jlo_association_OrderedMultiAssociationEnd_replace(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> oldAssociation, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> newAssociation) ;

    public java.util.List<TO> jlo_association_OrderedMultiAssociationEnd_getObjects() ;

    public java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> jlo_association_OrderedMultiAssociationEnd_getOtherAssociations() ;

    public void jlo_association_OrderedMultiAssociationEnd_unregister(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) ;

    public void jlo_association_OrderedMultiAssociationEnd_register(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) ;

    public boolean jlo_association_OrderedMultiAssociationEnd_registered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> registered) ;

    public boolean jlo_association_OrderedMultiAssociationEnd_unregistered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, final jlo.association.BidiAssociationEnd<? extends TO,? super FROM> unregistered) ;

    public boolean jlo_association_OrderedMultiAssociationEnd_contains(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) ;

}