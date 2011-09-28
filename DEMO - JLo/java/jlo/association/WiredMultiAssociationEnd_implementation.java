package jlo.association;

import java.lang.*;

public class WiredMultiAssociationEnd_implementation<FROM,TO> extends jlo.association.MultiAssociationEnd_implementation<FROM,TO> implements jlo.association.WiredMultiAssociationEnd<FROM,TO> {
     public WiredMultiAssociationEnd_implementation(FROM object) {
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