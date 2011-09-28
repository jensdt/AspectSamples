package jlo.graph;

import java.lang.*;
import jlo.association.TransitiveAssociationEnd;
import jlo.association.SingleAssociationEnd;
import jlo.association.AssociationEnd;

public abstract class WeightedTransitiveAssociationEnd_implementation<V,E> extends jlo.association.TransitiveAssociationEnd_implementation<V,E,V> implements jlo.graph.WeightedAssociationEnd_implementation<V,E>, jlo.graph.WeightedTransitiveAssociationEnd<V,E> {
     public WeightedTransitiveAssociationEnd_implementation(V object) {
        super(object, null, null);
    }

    public V otherEnd(V from, E middle) {
        return __select$second(middle).getOtherEnd();
    }

    public java.lang.Double weight(E edge) {
        return __select$weight(edge).getOtherEnd();
    }

    public V jlo_graph_WeightedTransitiveAssociationEnd_otherEnd(V from, E middle) {
        return __select$second(middle).getOtherEnd();
    }

    public java.lang.Double jlo_graph_WeightedTransitiveAssociationEnd_weight(E edge) {
        return __select$weight(edge).getOtherEnd();
    }

     public WeightedTransitiveAssociationEnd_implementation(V object, jlo_association_TransitiveAssociationEnd_object_constructor strategyForjlo_association_TransitiveAssociationEnd_object, jlo_association_TransitiveAssociationEnd_object_constructorFROM defaultstrategyForjlo_association_TransitiveAssociationEnd_object) {
        super(object, strategyForjlo_association_TransitiveAssociationEnd_object, defaultstrategyForjlo_association_TransitiveAssociationEnd_object);
    }

    public jlo.association.AssociationEnd<E> __select$first(V argument) {
        throw new java.lang.Error();
    }

    public jlo.association.SingleAssociationEnd<V> __select$second(E argument) {
        throw new java.lang.Error();
    }

    public jlo.association.SingleAssociationEnd<java.lang.Double> __select$weight(E argument) {
        throw new java.lang.Error();
    }

}