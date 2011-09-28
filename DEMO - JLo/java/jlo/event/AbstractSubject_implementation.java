package jlo.event;

import java.lang.*;
import java.util.List;
import jlo.association.MultiProperty;
import java.util.ArrayList;

public abstract class AbstractSubject_implementation<O> implements jlo.event.Subject_implementation<O>, jlo.event.AbstractSubject<O> {
     public AbstractSubject_implementation() {
        super();
        set__component__lkjkberfuncye____observers(new observers_implementation());
    }

    public synchronized void addObserver(O observer) {
        observers.add(observer);
    }

    public synchronized void removeObserver(O observer) {
        observers.remove(observer);
    }

    public synchronized java.util.List<O> observers() {
        return observers.getObjects();
    }

    public synchronized void notifyObservers() {
        for (O observer: observers()) {
            notifyObserver(observer);
        }
    }

    public abstract void notifyObserver(O observer) ;

    public synchronized void jlo_event_AbstractSubject_addObserver(O observer) {
        observers.add(observer);
    }

    public synchronized void jlo_event_AbstractSubject_removeObserver(O observer) {
        observers.remove(observer);
    }

    public synchronized java.util.List<O> jlo_event_AbstractSubject_observers() {
        return observers.getObjects();
    }

    public synchronized void jlo_event_AbstractSubject_notifyObservers() {
        for (O observer: observers()) {
            notifyObserver(observer);
        }
    }

    abstract static public class jlo_event_AbstractSubject_observers_constructor_implementation implements jlo.event.AbstractSubject.jlo_event_AbstractSubject_observers_constructor {
        abstract public jlo.event.AbstractSubject.observers construct(java.lang.Object object) ;

    }

     public AbstractSubject_implementation(jlo_event_AbstractSubject_observers_constructor strategyForjlo_event_AbstractSubject_observers, jlo_event_AbstractSubject_observers_constructor defaultstrategyForjlo_event_AbstractSubject_observers) {
        super();
        if((strategyForjlo_event_AbstractSubject_observers) == (null)) {
            if((defaultstrategyForjlo_event_AbstractSubject_observers) == (null)) {
                set__component__lkjkberfuncye____observers(new observers_implementation());
            }
            else {
                set__component__lkjkberfuncye____observers(defaultstrategyForjlo_event_AbstractSubject_observers.construct(this));
            }
        }
        else {
            set__component__lkjkberfuncye____observers(strategyForjlo_event_AbstractSubject_observers.construct(this));
        }
    }

    public observers<O> observers__component__lkjkberfuncye__() {
        return observers;
    }

    public void set__component__lkjkberfuncye____observers(observers<O> observers) {
        this.observers = observers;
    }

    public class observers_implementation extends jlo.association.MultiProperty_implementation<O> implements jlo.event.AbstractSubject.observers<O> {
         public observers_implementation() {
            super();
        }

         public observers_implementation(boolean frugal) {
            super(frugal);
        }

    }

    public observers<O> observers;

}