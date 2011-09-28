package jlo.association;

import java.lang.*;

public  interface WiredOrderedMultiAssociationEnd<FROM,TO> extends jlo.association.OrderedMultiAssociationEnd<FROM,TO> {
    public void remove(TO to) ;

    public void add(TO to) ;

    public jlo.association.BidiAssociationEnd<TO,FROM> __select$otherEnd(TO argument) ;

}