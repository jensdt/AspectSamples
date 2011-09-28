package jlo.event;

import java.lang.*;
import java.util.List;
import jlo.association.MultiProperty;
import java.util.ArrayList;

public abstract  interface AbstractSubject<O> extends jlo.event.Subject<O> {
    public void addObserver(O observer) ;

    public void removeObserver(O observer) ;

    public java.util.List<O> observers() ;

    public void notifyObservers() ;

    public abstract void notifyObserver(O observer) ;

    public void jlo_event_AbstractSubject_addObserver(O observer) ;

    public void jlo_event_AbstractSubject_removeObserver(O observer) ;

    public java.util.List<O> jlo_event_AbstractSubject_observers() ;

    public void jlo_event_AbstractSubject_notifyObservers() ;

    abstract static public  interface jlo_event_AbstractSubject_observers_constructor {
        abstract public jlo.event.AbstractSubject.observers construct(java.lang.Object object) ;

    }

    public observers<O> observers__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____observers(observers<O> observers) ;

    public  interface observers<O> extends jlo.association.MultiProperty<O> {
    }

}