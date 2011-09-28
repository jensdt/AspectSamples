package jlo.association;

import java.lang.*;
import java.util.List;
import java.util.ArrayList;

public class MultiProperty_implementation<T extends java.lang.Object> implements jlo.association.AssociationEnd_implementation<T>, jlo.association.MultiProperty<T> {
     public MultiProperty_implementation() {
        super();
    }

     public MultiProperty_implementation(boolean frugal) {
        super();
        _frugal = frugal;
    }

    public boolean _frugal;

    public boolean isFrugal() {
        return _frugal;
    }

    public java.util.List<T> _value;

    public synchronized void add(T value) {
        if(isValid(value)) {
            if((_value) == (null)) {
                _value = new java.util.ArrayList<T>();
            }
            _value.add(value);
        }
        else {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public boolean isValid(T value) {
        return (value) != (null);
    }

    public synchronized void remove(T value) {
        if((_value) != (null)) {
            _value.remove(value);
            if((_frugal && _value.isEmpty())) {
                _value = null;
            }
        }
    }

    public synchronized java.util.List<T> getObjects() {
        if((_value) != (null)) {
            return new java.util.ArrayList<T>(_value);
        }
        else {
            return new java.util.ArrayList<T>();
        }
    }

    public synchronized java.util.List<T> jlo_association_MultiProperty_getObjects() {
        if((_value) != (null)) {
            return new java.util.ArrayList<T>(_value);
        }
        else {
            return new java.util.ArrayList<T>();
        }
    }

}