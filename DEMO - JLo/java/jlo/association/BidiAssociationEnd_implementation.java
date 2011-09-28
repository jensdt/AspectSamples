package jlo.association;

import java.lang.*;
import java.util.List;

 public interface BidiAssociationEnd_implementation<FROM,TO> extends jlo.association.AssociationEnd_implementation<TO>, jlo.association.BidiAssociationEnd<FROM,TO> {
    public java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> getOtherAssociations() ;

    public boolean contains(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) ;

    public void register(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) ;

    public void unregister(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) ;

    public boolean isValidElement(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> association) ;

    public void replace(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> newElement) ;

    public void lock() ;

    public void unlock() ;

    public boolean isLocked() ;

    public FROM object() ;

}