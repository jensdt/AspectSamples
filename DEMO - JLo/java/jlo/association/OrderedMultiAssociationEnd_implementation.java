package jlo.association;

import java.lang.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;
import jlo.function.Function;

public class OrderedMultiAssociationEnd_implementation<FROM,TO> extends jlo.association.AbstractMultiAssociationEnd_implementation<FROM,TO> implements jlo.association.OrderedMultiAssociationEnd<FROM,TO> {
     public OrderedMultiAssociationEnd_implementation(FROM object) {
        super(object);
        _elements = new java.util.ArrayList<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>>();
    }

    public void remove(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) {
        checkLock();
        checkLock(other);
        if(contains(other)) {
            other.unregister(this);
            unregisterPrivate(other);
        }
    }

    public void clear() {
        checkLock();
        java.util.Collection<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> rels = new java.util.ArrayList<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>>(_elements);
        for (jlo.association.BidiAssociationEnd<? extends TO,? super FROM> rel: rels) {
            checkLock(rel);
        }
        for (jlo.association.BidiAssociationEnd<? extends TO,? super FROM> rel: rels) {
            remove(rel);
        }
    }

    public void add(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) {
        if(!(contains(element))) {
            checkLock();
            checkLock(element);
            if((element) != (null)) {
                element.register(this);
                registerPrivate(element);
            }
        }
    }

    public void addInFront(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) {
        if(!(contains(element))) {
            checkLock();
            checkLock(element);
            if((element) != (null)) {
                element.register(this);
                registerInFrontPrivate(element);
            }
        }
    }

    public void replace(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> oldAssociation, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> newAssociation) {
        int index = _elements.indexOf(oldAssociation);
        if((index) != (-(1))) {
            checkLock();
            checkLock(oldAssociation);
            checkLock(newAssociation);
            _elements.set(index, newAssociation);
            newAssociation.register(this);
            oldAssociation.unregister(this);
            fireElementReplaced(oldAssociation.object(), newAssociation.object());
        }
    }

    public java.util.List<TO> getObjects() {
        final java.util.List<TO> result = new java.util.ArrayList<TO>();
        for (jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element: _elements) {
            result.add(element.object());
        }
        return result;
    }

    public TO lastElement() {
        int size = _elements.size();
        if((size) > (0)) {
            return _elements.get((size) - (1)).object();
        }
        else {
            return null;
        }
    }

    public TO elementAt(int index) {
        if(((index) < (1) || (index) > (size()))) {
            throw new java.lang.IllegalArgumentException();
        }
        return _elements.get((index) - (1)).object();
    }

    public java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> getOtherAssociations() {
        return new java.util.ArrayList<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>>(_elements);
    }

    public void unregister(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) {
        unregisterPrivate(association);
    }

    public void unregisterPrivate(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) {
        boolean removed = _elements.remove(association);
        if(removed) {
            fireElementRemoved(association.object());
        }
    }

    public void register(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) {
        if(!(contains(association))) {
            registerPrivate(association);
        }
    }

    public void registerPrivate(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) {
        _elements.add(association);
        fireElementAdded(association.object());
    }

    public void registerInFrontPrivate(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) {
        _elements.add(0, association);
        fireElementAdded(association.object());
    }

    public boolean registered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> registered) {
        boolean contains = true;
        java.util.Iterator<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> iter = _elements.iterator();
        while ((contains && iter.hasNext())) {
            contains = contains(iter.next());
        }
        return (((oldConnections) != (null) && contains(registered)) && contains);
    }

    public boolean unregistered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, final jlo.association.BidiAssociationEnd<? extends TO,? super FROM> unregistered) {
        boolean contains = true;
        java.util.Iterator<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> iter = oldConnections.iterator();
        while ((contains && iter.hasNext())) {
            jlo.association.BidiAssociationEnd<? extends TO,? super FROM> o = iter.next();
            contains = ((o) == (unregistered) || contains(o));
        }
        return ((((oldConnections) != (null) && oldConnections.contains(unregistered)) && !(contains(unregistered))) && contains);
    }

    public int size() {
        return _elements.size();
    }

    public boolean contains(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) {
        return _elements.contains(element);
    }

    public java.util.ArrayList<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> _elements;

    public void jlo_association_OrderedMultiAssociationEnd_remove(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) {
        checkLock();
        checkLock(other);
        if(contains(other)) {
            other.unregister(this);
            unregisterPrivate(other);
        }
    }

    public void jlo_association_OrderedMultiAssociationEnd_clear() {
        checkLock();
        java.util.Collection<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> rels = new java.util.ArrayList<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>>(_elements);
        for (jlo.association.BidiAssociationEnd<? extends TO,? super FROM> rel: rels) {
            checkLock(rel);
        }
        for (jlo.association.BidiAssociationEnd<? extends TO,? super FROM> rel: rels) {
            remove(rel);
        }
    }

    public void jlo_association_OrderedMultiAssociationEnd_add(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) {
        if(!(contains(element))) {
            checkLock();
            checkLock(element);
            if((element) != (null)) {
                element.register(this);
                registerPrivate(element);
            }
        }
    }

    public void jlo_association_OrderedMultiAssociationEnd_replace(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> oldAssociation, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> newAssociation) {
        int index = _elements.indexOf(oldAssociation);
        if((index) != (-(1))) {
            checkLock();
            checkLock(oldAssociation);
            checkLock(newAssociation);
            _elements.set(index, newAssociation);
            newAssociation.register(this);
            oldAssociation.unregister(this);
            fireElementReplaced(oldAssociation.object(), newAssociation.object());
        }
    }

    public java.util.List<TO> jlo_association_OrderedMultiAssociationEnd_getObjects() {
        final java.util.List<TO> result = new java.util.ArrayList<TO>();
        for (jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element: _elements) {
            result.add(element.object());
        }
        return result;
    }

    public java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> jlo_association_OrderedMultiAssociationEnd_getOtherAssociations() {
        return new java.util.ArrayList<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>>(_elements);
    }

    public void jlo_association_OrderedMultiAssociationEnd_unregister(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) {
        unregisterPrivate(association);
    }

    public void jlo_association_OrderedMultiAssociationEnd_register(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) {
        if(!(contains(association))) {
            registerPrivate(association);
        }
    }

    public boolean jlo_association_OrderedMultiAssociationEnd_registered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> registered) {
        boolean contains = true;
        java.util.Iterator<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> iter = _elements.iterator();
        while ((contains && iter.hasNext())) {
            contains = contains(iter.next());
        }
        return (((oldConnections) != (null) && contains(registered)) && contains);
    }

    public boolean jlo_association_OrderedMultiAssociationEnd_unregistered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, final jlo.association.BidiAssociationEnd<? extends TO,? super FROM> unregistered) {
        boolean contains = true;
        java.util.Iterator<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> iter = oldConnections.iterator();
        while ((contains && iter.hasNext())) {
            jlo.association.BidiAssociationEnd<? extends TO,? super FROM> o = iter.next();
            contains = ((o) == (unregistered) || contains(o));
        }
        return ((((oldConnections) != (null) && oldConnections.contains(unregistered)) && !(contains(unregistered))) && contains);
    }

    public boolean jlo_association_OrderedMultiAssociationEnd_contains(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) {
        return _elements.contains(element);
    }

}