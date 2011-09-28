package jlo.association;

import java.lang.*;

public abstract class AbstractMultiAssociationEnd_implementation<FROM,TO> extends jlo.association.AbstractAssociationEnd_implementation<FROM,TO> implements jlo.association.AbstractMultiAssociationEnd<FROM,TO> {
     public AbstractMultiAssociationEnd_implementation(FROM object) {
        super(object);
    }

    public abstract void remove(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> other) ;

    public abstract void add(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> element) ;

    public boolean isValidElement(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> relation) {
        return (relation) != (null);
    }

    public boolean jlo_association_AbstractMultiAssociationEnd_isValidElement(jlo.association.BidiAssociationEnd<? extends TO,? super FROM> relation) {
        return (relation) != (null);
    }

}