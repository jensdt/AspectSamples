package jlo.graph;

import java.lang.*;
import jlo.association.AssociationEnd;
import jlo.association.SingleAssociationEnd;

public  interface WiredWeightedEdge<V,E> {
    public java.lang.Double weight(E edge) ;

    public V otherEnd(V v, E edge) ;

    public jlo.association.SingleAssociationEnd<V> __select$start(E argument) ;

    public jlo.association.SingleAssociationEnd<V> __select$end(E argument) ;

    public jlo.association.SingleAssociationEnd<java.lang.Double> __select$weight(E argument) ;

}