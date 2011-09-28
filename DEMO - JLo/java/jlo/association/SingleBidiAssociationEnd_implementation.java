package jlo.association;

import java.lang.*;
import java.util.List;
import java.util.ArrayList;
import jlo.function.Function;

public class SingleBidiAssociationEnd_implementation<FROM,TO> extends jlo.association.AbstractAssociationEnd_implementation<FROM,TO> implements jlo.association.SingleAssociationEnd_implementation<TO>, jlo.association.SingleBidiAssociationEnd<FROM,TO> {
     public SingleBidiAssociationEnd_implementation(FROM object) {
        super(object);
    }

    public TO getOtherEnd() {
        if((getOtherAssociation()) == (null)) {
            return null;
        }
        return getOtherAssociation().object();
    }

    public java.util.List<TO> getObjects() {
        java.util.ArrayList<TO> result = new java.util.ArrayList<TO>();
        if((getOtherAssociation()) == (null)) {
            return result;
        }
        result.add(getOtherAssociation().object());
        return result;
    }

    public void connectTo(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) {
        checkLock();
        checkLock(getOtherAssociation());
        checkLock(other);
        if((other) != (_other)) {
            register(other);
            if((other) != (null)) {
                other.register(this);
            }
        }
    }

    public boolean registered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> registered) {
        return (((oldConnections) != (null) && contains(registered)) && ((oldConnections.size()) == (0) || ((oldConnections.size()) == (1) && ((oldConnections.get(1)) == (registered) || !(contains(oldConnections.get(1)))))));
    }

    public boolean unregistered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> unregistered) {
        return (((oldConnections) != (null) && getObjects().isEmpty()) && (((oldConnections.size()) == (1) && (oldConnections.get(1)) == (unregistered)) || (oldConnections.size()) == (0)));
    }

    public boolean isValidElement(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> relation) {
        return true;
    }

    public void unregister(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) {
        if((_other) != (null)) {
            TO old = _other.object();
            _other = null;
            fireElementRemoved(old);
        }
    }

    public void register(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) {
        if((_other) != (null)) {
            TO old = _other.object();
            _other.unregister(this);
            _other = other;
            TO newObject = ((_other) != (null) ? _other.object() : null);
            fireElementReplaced(old, newObject);
        }
        else if((other) != (null)) {
            _other = other;
            fireElementAdded(_other.object());
        }
    }

    public jlo.association.BidiAssociationEnd<? extends TO,? super FROM> getOtherAssociation() {
        return _other;
    }

    public java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> getOtherAssociations() {
        java.util.ArrayList<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> result = new java.util.ArrayList<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>>();
        if((_other) != (null)) {
            result.add(_other);
        }
        return result;
    }

    public jlo.association.BidiAssociationEnd<? extends TO,? super FROM> _other;

    public void replace(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> newElement) {
        if(contains(element)) {
            connectTo(newElement);
        }
    }

    public void clear() {
        connectTo(null);
    }

    public TO jlo_association_SingleBidiAssociationEnd_getOtherEnd() {
        if((getOtherAssociation()) == (null)) {
            return null;
        }
        return getOtherAssociation().object();
    }

    public java.util.List<TO> jlo_association_SingleBidiAssociationEnd_getObjects() {
        java.util.ArrayList<TO> result = new java.util.ArrayList<TO>();
        if((getOtherAssociation()) == (null)) {
            return result;
        }
        result.add(getOtherAssociation().object());
        return result;
    }

    public boolean jlo_association_SingleBidiAssociationEnd_registered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> registered) {
        return (((oldConnections) != (null) && contains(registered)) && ((oldConnections.size()) == (0) || ((oldConnections.size()) == (1) && ((oldConnections.get(1)) == (registered) || !(contains(oldConnections.get(1)))))));
    }

    public boolean jlo_association_SingleBidiAssociationEnd_unregistered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> unregistered) {
        return (((oldConnections) != (null) && getObjects().isEmpty()) && (((oldConnections.size()) == (1) && (oldConnections.get(1)) == (unregistered)) || (oldConnections.size()) == (0)));
    }

    public boolean jlo_association_SingleBidiAssociationEnd_isValidElement(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> relation) {
        return true;
    }

    public void jlo_association_SingleBidiAssociationEnd_unregister(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) {
        if((_other) != (null)) {
            TO old = _other.object();
            _other = null;
            fireElementRemoved(old);
        }
    }

    public void jlo_association_SingleBidiAssociationEnd_register(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) {
        if((_other) != (null)) {
            TO old = _other.object();
            _other.unregister(this);
            _other = other;
            TO newObject = ((_other) != (null) ? _other.object() : null);
            fireElementReplaced(old, newObject);
        }
        else if((other) != (null)) {
            _other = other;
            fireElementAdded(_other.object());
        }
    }

    public java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> jlo_association_SingleBidiAssociationEnd_getOtherAssociations() {
        java.util.ArrayList<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> result = new java.util.ArrayList<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>>();
        if((_other) != (null)) {
            result.add(_other);
        }
        return result;
    }

    public void jlo_association_SingleBidiAssociationEnd_replace(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> newElement) {
        if(contains(element)) {
            connectTo(newElement);
        }
    }

    public void jlo_association_SingleBidiAssociationEnd_clear() {
        connectTo(null);
    }

}