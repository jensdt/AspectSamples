package jlo.association;

import java.lang.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import jlo.function.Function;
import java.util.Set;

public  interface MultiAssociationSet<FROM,TO> extends jlo.association.AbstractMultiAssociationEnd<FROM,TO> {
    public void remove(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) ;

    public void add(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) ;

    public java.util.List<TO> getObjects() ;

    public java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> getOtherAssociations() ;

    public void unregister(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) ;

    public void register(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) ;

    public boolean registered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> registered) ;

    public boolean unregistered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> unregistered) ;

    public int size() ;

    public boolean contains(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) ;

    public void replace(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> newElement) ;

    public void clear() ;

    public void jlo_association_MultiAssociationSet_remove(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) ;

    public void jlo_association_MultiAssociationSet_add(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) ;

    public java.util.List<TO> jlo_association_MultiAssociationSet_getObjects() ;

    public java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> jlo_association_MultiAssociationSet_getOtherAssociations() ;

    public void jlo_association_MultiAssociationSet_unregister(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) ;

    public void jlo_association_MultiAssociationSet_register(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) ;

    public boolean jlo_association_MultiAssociationSet_registered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> registered) ;

    public boolean jlo_association_MultiAssociationSet_unregistered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> unregistered) ;

    public boolean jlo_association_MultiAssociationSet_contains(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) ;

    public void jlo_association_MultiAssociationSet_replace(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> newElement) ;

    public void jlo_association_MultiAssociationSet_clear() ;

}