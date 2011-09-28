package jlo.association;

import java.lang.*;

public abstract  interface AbstractMultiAssociationEnd<FROM,TO> extends jlo.association.AbstractAssociationEnd<FROM,TO> {
    public abstract void remove(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) ;

    public abstract void add(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) ;

    public boolean isValidElement(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> relation) ;

    public boolean jlo_association_AbstractMultiAssociationEnd_isValidElement(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> relation) ;

}