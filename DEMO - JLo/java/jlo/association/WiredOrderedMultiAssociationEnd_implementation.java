package jlo.association;

import java.lang.*;

public class WiredOrderedMultiAssociationEnd_implementation<FROM,TO> extends jlo.association.OrderedMultiAssociationEnd_implementation<FROM,TO> implements jlo.association.WiredOrderedMultiAssociationEnd<FROM,TO> {
     public WiredOrderedMultiAssociationEnd_implementation(FROM object) {
        super(object);
    }

    public void remove(TO to) {
        remove(__select$otherEnd(to));
    }

    public void add(TO to) {
        add(__select$otherEnd(to));
    }

    public jlo.association.BidiAssociationEnd<TO,FROM> __select$otherEnd(TO argument) {
        throw new java.lang.Error();
    }

}