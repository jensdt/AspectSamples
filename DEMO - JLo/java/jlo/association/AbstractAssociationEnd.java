package jlo.association;

import java.lang.*;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public abstract  interface AbstractAssociationEnd<FROM,TO> extends jlo.association.BidiAssociationEnd<FROM,TO> {
    public boolean contains(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) ;

    public boolean equals(java.lang.Object other) ;

    public void checkLock() ;

    public void checkLock(jlo.association.BidiAssociationEnd<?,?> association) ;

    public abstract boolean registered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> registered) ;

    public abstract boolean unregistered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> unregistered) ;

    public FROM object() ;

    public void lock() ;

    public void unlock() ;

    public boolean isLocked() ;

    public void addListener(jlo.association.AssociationListener<? super TO> listener) ;

    public void removeListener(jlo.association.AssociationListener<? super TO> listener) ;

    public java.util.Set<jlo.association.AssociationListener<? super TO>> listeners() ;

    public void fireElementAdded(TO addedElement) ;

    public void fireElementRemoved(TO addedElement) ;

    public void fireElementReplaced(TO oldElement, TO newElement) ;

    public void disableEvents() ;

    public void enableEvents() ;

    public boolean eventsBlocked() ;

    public abstract void clear() ;

    public boolean jlo_association_AbstractAssociationEnd_contains(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) ;

    public boolean jlo_association_AbstractAssociationEnd_equals(java.lang.Object other) ;

    public FROM jlo_association_AbstractAssociationEnd_object() ;

    public void jlo_association_AbstractAssociationEnd_lock() ;

    public void jlo_association_AbstractAssociationEnd_unlock() ;

    public boolean jlo_association_AbstractAssociationEnd_isLocked() ;

}