package jlo.association;

import java.lang.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import jlo.function.Function;
import java.util.Set;

public class MultiAssociationSet_implementation<FROM,TO> extends jlo.association.AbstractMultiAssociationEnd_implementation<FROM,TO> implements jlo.association.MultiAssociationSet<FROM,TO> {
     public MultiAssociationSet_implementation(FROM object) {
        super(object);
        _elements = new java.util.HashSet<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>>();
    }

    public void remove(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) {
        checkLock();
        checkLock(other);
        if(contains(other)) {
            other.unregister(this);
            unregister(other);
        }
    }

    public void add(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) {
        checkLock();
        checkLock(element);
        if((element) != (null)) {
            element.register(this);
            register(element);
        }
    }

    public java.util.List<TO> getObjects() {
        java.util.Set<TO> result = new java.util.HashSet<TO>();
        for (jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element: _elements) {
            result.add(element.object());
        }
        return new java.util.ArrayList<TO>(result);
    }

    public java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> getOtherAssociations() {
        return new java.util.ArrayList<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>>(_elements);
    }

    public void unregister(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) {
        boolean removed = _elements.remove(element);
        if(removed) {
            fireElementRemoved(element.object());
        }
    }

    public void register(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) {
        boolean added = _elements.add(element);
        if(added) {
            fireElementAdded(element.object());
        }
    }

    public boolean registered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> registered) {
        boolean contains = true;
        java.util.Iterator<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> iter = _elements.iterator();
        while ((contains && iter.hasNext())) {
            contains = contains(iter.next());
        }
        return (((oldConnections) != (null) && contains(registered)) && contains);
    }

    public boolean unregistered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> unregistered) {
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

    public java.util.HashSet<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> _elements;

    public void replace(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> newElement) {
        if(contains(element)) {
            checkLock();
            checkLock(element);
            checkLock(newElement);
            disableEvents();
            remove(element);
            add(newElement);
            enableEvents();
            fireElementReplaced(element.object(), newElement.object());
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

    public void jlo_association_MultiAssociationSet_remove(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) {
        checkLock();
        checkLock(other);
        if(contains(other)) {
            other.unregister(this);
            unregister(other);
        }
    }

    public void jlo_association_MultiAssociationSet_add(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) {
        checkLock();
        checkLock(element);
        if((element) != (null)) {
            element.register(this);
            register(element);
        }
    }

    public java.util.List<TO> jlo_association_MultiAssociationSet_getObjects() {
        java.util.Set<TO> result = new java.util.HashSet<TO>();
        for (jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element: _elements) {
            result.add(element.object());
        }
        return new java.util.ArrayList<TO>(result);
    }

    public java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> jlo_association_MultiAssociationSet_getOtherAssociations() {
        return new java.util.ArrayList<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>>(_elements);
    }

    public void jlo_association_MultiAssociationSet_unregister(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) {
        boolean removed = _elements.remove(element);
        if(removed) {
            fireElementRemoved(element.object());
        }
    }

    public void jlo_association_MultiAssociationSet_register(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) {
        boolean added = _elements.add(element);
        if(added) {
            fireElementAdded(element.object());
        }
    }

    public boolean jlo_association_MultiAssociationSet_registered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> registered) {
        boolean contains = true;
        java.util.Iterator<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> iter = _elements.iterator();
        while ((contains && iter.hasNext())) {
            contains = contains(iter.next());
        }
        return (((oldConnections) != (null) && contains(registered)) && contains);
    }

    public boolean jlo_association_MultiAssociationSet_unregistered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> unregistered) {
        boolean contains = true;
        java.util.Iterator<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> iter = oldConnections.iterator();
        while ((contains && iter.hasNext())) {
            jlo.association.BidiAssociationEnd<? extends TO,? super FROM> o = iter.next();
            contains = ((o) == (unregistered) || contains(o));
        }
        return ((((oldConnections) != (null) && oldConnections.contains(unregistered)) && !(contains(unregistered))) && contains);
    }

    public boolean jlo_association_MultiAssociationSet_contains(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) {
        return _elements.contains(element);
    }

    public void jlo_association_MultiAssociationSet_replace(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> newElement) {
        if(contains(element)) {
            checkLock();
            checkLock(element);
            checkLock(newElement);
            disableEvents();
            remove(element);
            add(newElement);
            enableEvents();
            fireElementReplaced(element.object(), newElement.object());
        }
    }

    public void jlo_association_MultiAssociationSet_clear() {
        checkLock();
        java.util.Collection<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> rels = new java.util.ArrayList<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>>(_elements);
        for (jlo.association.BidiAssociationEnd<? extends TO,? super FROM> rel: rels) {
            checkLock(rel);
        }
        for (jlo.association.BidiAssociationEnd<? extends TO,? super FROM> rel: rels) {
            remove(rel);
        }
    }

}