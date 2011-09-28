package jlo.graph;

import java.lang.*;
import jlo.association.TransitiveAssociationEnd;
import jlo.association.SingleAssociationEnd;
import jlo.association.AssociationEnd;
import java.util.List;

 public interface WeightedAssociationEnd_implementation<V,E> extends jlo.association.AssociationEnd_implementation<V>, jlo.graph.WeightedAssociationEnd<V,E> {
    public V otherEnd(V vertex, E edge) ;

    public abstract java.lang.Double weight(E edge) ;

    public java.util.List<E> edges() ;

}