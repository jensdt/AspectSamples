package jlo.association;

import java.lang.*;

 public interface AssociationListener_implementation<T> extends jlo.association.AssociationListener<T> {
    public void notifyElementAdded(T element) ;

    public void notifyElementRemoved(T element) ;

    public void notifyElementReplaced(T oldElement, T newElement) ;

}