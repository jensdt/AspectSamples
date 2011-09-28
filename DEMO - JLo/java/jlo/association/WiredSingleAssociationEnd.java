package jlo.association;

import java.lang.*;

public  interface WiredSingleAssociationEnd<FROM,TO> extends jlo.association.SingleBidiAssociationEnd<FROM,TO> {
    public void connect(TO to) ;

    public jlo.association.BidiAssociationEnd<TO,FROM> __select$otherEnd(TO argument) ;

}