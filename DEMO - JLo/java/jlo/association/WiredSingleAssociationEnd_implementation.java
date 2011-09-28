package jlo.association;

import java.lang.*;

public class WiredSingleAssociationEnd_implementation<FROM,TO> extends jlo.association.SingleBidiAssociationEnd_implementation<FROM,TO> implements jlo.association.WiredSingleAssociationEnd<FROM,TO> {
     public WiredSingleAssociationEnd_implementation(FROM object) {
        super(object);
    }

    public void connect(TO to) {
        connectTo(__select$otherEnd(to));
    }

    public jlo.association.BidiAssociationEnd<TO,FROM> __select$otherEnd(TO argument) {
        throw new java.lang.Error();
    }

}