package jlo.graph;

import java.lang.*;
import jlo.association.AssociationEnd;
import jlo.association.SingleAssociationEnd;

public class WiredWeightedEdge_implementation<V,E> extends java.lang.Object implements jlo.graph.WiredWeightedEdge<V,E> {
    public java.lang.Double weight(E edge) {
        return __select$weight(edge).getOtherEnd();
    }

    public V otherEnd(V v, E edge) {
        V result = __select$start(edge).getOtherEnd();
        if((result) == (v)) {
            return __select$end(edge).getOtherEnd();
        }
        else {
            return result;
        }
    }

     public WiredWeightedEdge_implementation() {
        super();
    }

    public jlo.association.SingleAssociationEnd<V> __select$start(E argument) {
        throw new java.lang.Error();
    }

    public jlo.association.SingleAssociationEnd<V> __select$end(E argument) {
        throw new java.lang.Error();
    }

    public jlo.association.SingleAssociationEnd<java.lang.Double> __select$weight(E argument) {
        throw new java.lang.Error();
    }

}