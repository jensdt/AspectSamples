package jlo.graph;

import java.lang.*;
import jlo.association.TransitiveAssociationEnd;
import jlo.association.SingleAssociationEnd;
import jlo.association.AssociationEnd;

public abstract  interface WeightedTransitiveAssociationEnd<V,E> extends jlo.association.TransitiveAssociationEnd<V,E,V>, jlo.graph.WeightedAssociationEnd<V,E> {
    public V otherEnd(V from, E middle) ;

    public java.lang.Double weight(E edge) ;

    public V jlo_graph_WeightedTransitiveAssociationEnd_otherEnd(V from, E middle) ;

    public java.lang.Double jlo_graph_WeightedTransitiveAssociationEnd_weight(E edge) ;

    public jlo.association.AssociationEnd<E> __select$first(V argument) ;

    public jlo.association.SingleAssociationEnd<V> __select$second(E argument) ;

    public jlo.association.SingleAssociationEnd<java.lang.Double> __select$weight(E argument) ;

}