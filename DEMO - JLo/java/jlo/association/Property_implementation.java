package jlo.association;

import java.lang.*;
import java.util.List;
import java.util.ArrayList;

public class Property_implementation<T extends java.lang.Object> implements jlo.association.SingleAssociationEnd_implementation<T>, jlo.association.Property<T> {
     public Property_implementation(T value) {
        super();
        setValue(value);
    }

     public Property_implementation(T value, boolean notUsed) {
        super();
        _value = value;
    }

    public T _value;

    public void setValue(T value) {
        _value = value;
    }

    public T getValue() {
        return _value;
    }

    public T getValueWithParam(T param) {
        return _value;
    }

    public T getOtherEnd() {
        return _value;
    }

    public java.util.List<T> getObjects() {
        java.util.List<T> result = new java.util.ArrayList<T>();
        T value = getValue();
        if((value) != (null)) {
            result.add(value);
        }
        return result;
    }

    public T jlo_association_Property_getOtherEnd() {
        return _value;
    }

    public java.util.List<T> jlo_association_Property_getObjects() {
        java.util.List<T> result = new java.util.ArrayList<T>();
        T value = getValue();
        if((value) != (null)) {
            result.add(value);
        }
        return result;
    }

}