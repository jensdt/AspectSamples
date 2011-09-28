package jlo.event;

import java.lang.*;
import java.util.List;

 public  interface Subject<O> {
    public void addObserver(O observer) ;

    public void removeObserver(O observer) ;

    public java.util.List<O> observers() ;

    public void notifyObservers() ;

}