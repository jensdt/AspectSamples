package jlo.association;

import java.lang.*;

 public  interface AssociationListener<T> {
    public void notifyElementAdded(T element) ;

    public void notifyElementRemoved(T element) ;

    public void notifyElementReplaced(T oldElement, T newElement) ;

}