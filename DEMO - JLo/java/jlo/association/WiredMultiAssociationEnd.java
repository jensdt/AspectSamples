package jlo.association;

import java.lang.*;

public  interface WiredMultiAssociationEnd<FROM,TO> extends jlo.association.MultiAssociationEnd<FROM,TO> {
    public void remove(TO to) ;

    public void add(TO to) ;

    public jlo.association.BidiAssociationEnd<TO,FROM> __select$otherEnd(TO argument) ;

}