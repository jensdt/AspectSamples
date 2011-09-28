package jlo.association;

import java.lang.*;
import java.util.List;
import java.util.ArrayList;
import jlo.function.Function;

public  interface SingleBidiAssociationEnd<FROM,TO> extends jlo.association.AbstractAssociationEnd<FROM,TO>, jlo.association.SingleAssociationEnd<TO> {
    public TO getOtherEnd() ;

    public java.util.List<TO> getObjects() ;

    public void connectTo(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) ;

    public boolean registered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> registered) ;

    public boolean unregistered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> unregistered) ;

    public boolean isValidElement(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> relation) ;

    public void unregister(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) ;

    public void register(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) ;

    public jlo.association.BidiAssociationEnd<? extends TO,? super FROM> getOtherAssociation() ;

    public java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> getOtherAssociations() ;

    public void replace(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> newElement) ;

    public void clear() ;

    public TO jlo_association_SingleBidiAssociationEnd_getOtherEnd() ;

    public java.util.List<TO> jlo_association_SingleBidiAssociationEnd_getObjects() ;

    public boolean jlo_association_SingleBidiAssociationEnd_registered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> registered) ;

    public boolean jlo_association_SingleBidiAssociationEnd_unregistered(java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> oldConnections, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> unregistered) ;

    public boolean jlo_association_SingleBidiAssociationEnd_isValidElement(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> relation) ;

    public void jlo_association_SingleBidiAssociationEnd_unregister(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) ;

    public void jlo_association_SingleBidiAssociationEnd_register(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) ;

    public java.util.List<jlo.association.BidiAssociationEnd<? extends TO,? super FROM>> jlo_association_SingleBidiAssociationEnd_getOtherAssociations() ;

    public void jlo_association_SingleBidiAssociationEnd_replace(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element, jlo.association.BidiAssociationEnd<? extends TO,? super FROM> newElement) ;

    public void jlo_association_SingleBidiAssociationEnd_clear() ;

}