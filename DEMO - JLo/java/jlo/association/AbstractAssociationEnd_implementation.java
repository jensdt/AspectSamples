package jlo.association;

import java.lang.*;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public abstract class AbstractAssociationEnd_implementation<FROM,TO> implements jlo.association.BidiAssociationEnd_implementation<FROM,TO>, jlo.association.AbstractAssociationEnd<FROM,TO> {
     public AbstractAssociationEnd_implementation(FROM object) {
        super();
        _object = object;
    }

    public boolean contains(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) {
        return getOtherAssociations().contains(association);
    }

    public boolean equals(java.lang.Object other) {
        return (other) == (this);
    }

    public void checkLock() {
        checkLock(this);
    }

    public void checkLock(jlo.association.BidiAssociationEnd<?,?> association) {
        if(((association) != (null) && association.isLocked())) {
            throw new java.lang.IllegalArgumentException(("Trying to modify locked reference. Locked object: ") + (association.object().getClass().getName()));
        }
    }

    public abstract boolean registered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> registered) ;

    public abstract boolean unregistered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> unregistered) ;

    public FROM object() {
        return _object;
    }

    final public FROM _object;

    public boolean _locked = false;

    public void lock() {
        _locked = true;
    }

    public void unlock() {
        _locked = false;
    }

    public boolean isLocked() {
        return _locked;
    }

    public void addListener(jlo.association.AssociationListener<? super TO> listener) {
        if((listener) == (null)) {
            throw new java.lang.IllegalArgumentException("An association listener cannot be null.");
        }
        if((_listeners) == (null)) {
            _listeners = new java.util.HashSet<jlo.association.AssociationListener<? super TO>>();
        }
        _listeners.add(listener);
    }

    public void removeListener(jlo.association.AssociationListener<? super TO> listener) {
        if((_listeners) != (null)) {
            _listeners.remove(listener);
            if(_listeners.isEmpty()) {
                _listeners = null;
            }
        }
    }

    public java.util.Set<jlo.association.AssociationListener<? super TO>> listeners() {
        return new java.util.HashSet<jlo.association.AssociationListener<? super TO>>(_listeners);
    }

    public java.util.Set<jlo.association.AssociationListener<? super TO>> _listeners;

    public void fireElementAdded(TO addedElement) {
        if((!(_eventsBlocked) && (_listeners) != (null))) {
            for (jlo.association.AssociationListener<? super TO> listener: _listeners) {
                listener.notifyElementAdded(addedElement);
            }
        }
    }

    public void fireElementRemoved(TO addedElement) {
        if((!(_eventsBlocked) && (_listeners) != (null))) {
            for (jlo.association.AssociationListener<? super TO> listener: _listeners) {
                listener.notifyElementRemoved(addedElement);
            }
        }
    }

    public void fireElementReplaced(TO oldElement, TO newElement) {
        if((!(_eventsBlocked) && (_listeners) != (null))) {
            for (jlo.association.AssociationListener<? super TO> listener: _listeners) {
                listener.notifyElementReplaced(oldElement, newElement);
            }
        }
    }

    public boolean _eventsBlocked;

    public void disableEvents() {
        _eventsBlocked = true;
    }

    public void enableEvents() {
        _eventsBlocked = false;
    }

    public boolean eventsBlocked() {
        return _eventsBlocked;
    }

    public abstract void clear() ;

    public boolean jlo_association_AbstractAssociationEnd_contains(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) {
        return getOtherAssociations().contains(association);
    }

    public boolean jlo_association_AbstractAssociationEnd_equals(java.lang.Object other) {
        return (other) == (this);
    }

    public FROM jlo_association_AbstractAssociationEnd_object() {
        return _object;
    }

    public void jlo_association_AbstractAssociationEnd_lock() {
        _locked = true;
    }

    public void jlo_association_AbstractAssociationEnd_unlock() {
        _locked = false;
    }

    public boolean jlo_association_AbstractAssociationEnd_isLocked() {
        return _locked;
    }

}