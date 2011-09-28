package jlo.graph;

import java.lang.*;
import jlo.association.AssociationEnd;
import jlo.association.Property;
import java.util.List;
import java.util.ArrayList;

public class WiredWeightedAssociationEnd_implementation<V,E> implements jlo.graph.WeightedAssociationEnd_implementation<V,E>, jlo.graph.WiredWeightedAssociationEnd<V,E> {
     public WiredWeightedAssociationEnd_implementation(V v) {
        super();
        set__component__lkjkberfuncye____object(new object_implementation(v));
    }

    public java.util.List<V> getObjects() {
        java.util.List<E> edgeNodes = __select$edge(object()).getObjects();
        java.util.List<V> result = new java.util.ArrayList<V>();
        for (E e: edgeNodes) {
            jlo.graph.WiredWeightedEdge<V,E> edge = __select$weightedEdge(e);
            result.add(edge.otherEnd(object(), e));
        }
        return result;
    }

    public java.lang.Double weight(E e) {
        return __select$weightedEdge(e).weight(e);
    }

    public V otherEnd(V v, E e) {
        return __select$weightedEdge(e).otherEnd(v, e);
    }

    public java.util.List<E> edges() {
        return __select$edge(object()).getObjects();
    }

    public java.util.List<V> jlo_graph_WiredWeightedAssociationEnd_getObjects() {
        java.util.List<E> edgeNodes = __select$edge(object()).getObjects();
        java.util.List<V> result = new java.util.ArrayList<V>();
        for (E e: edgeNodes) {
            jlo.graph.WiredWeightedEdge<V,E> edge = __select$weightedEdge(e);
            result.add(edge.otherEnd(object(), e));
        }
        return result;
    }

    public java.lang.Double jlo_graph_WiredWeightedAssociationEnd_weight(E e) {
        return __select$weightedEdge(e).weight(e);
    }

    public V jlo_graph_WiredWeightedAssociationEnd_otherEnd(V v, E e) {
        return __select$weightedEdge(e).otherEnd(v, e);
    }

    public java.util.List<E> jlo_graph_WiredWeightedAssociationEnd_edges() {
        return __select$edge(object()).getObjects();
    }

    abstract static public class jlo_graph_WiredWeightedAssociationEnd_object_constructor_implementation implements jlo.graph.WiredWeightedAssociationEnd.jlo_graph_WiredWeightedAssociationEnd_object_constructor {
        abstract public jlo.graph.WiredWeightedAssociationEnd.object construct(java.lang.Object object) ;

    }

    abstract static public class jlo_graph_WiredWeightedAssociationEnd_object_constructorV_implementation<V,E> implements jlo.graph.WiredWeightedAssociationEnd.jlo_graph_WiredWeightedAssociationEnd_object_constructorV<V,E> {
        abstract public jlo.graph.WiredWeightedAssociationEnd.object construct(java.lang.Object objectafrkuscggfjsdk, V value) ;

    }

     public WiredWeightedAssociationEnd_implementation(V v, jlo_graph_WiredWeightedAssociationEnd_object_constructor strategyForjlo_graph_WiredWeightedAssociationEnd_object, jlo_graph_WiredWeightedAssociationEnd_object_constructorV defaultstrategyForjlo_graph_WiredWeightedAssociationEnd_object) {
        super();
        if((strategyForjlo_graph_WiredWeightedAssociationEnd_object) == (null)) {
            if((defaultstrategyForjlo_graph_WiredWeightedAssociationEnd_object) == (null)) {
                set__component__lkjkberfuncye____object(new object_implementation(v));
            }
            else {
                set__component__lkjkberfuncye____object(defaultstrategyForjlo_graph_WiredWeightedAssociationEnd_object.construct(this, v));
            }
        }
        else {
            set__component__lkjkberfuncye____object(strategyForjlo_graph_WiredWeightedAssociationEnd_object.construct(this));
        }
    }

    public object<V,E> object__component__lkjkberfuncye__() {
        return object;
    }

    public void set__component__lkjkberfuncye____object(object<V,E> object) {
        this.object = object;
    }

    public class object_implementation extends jlo.association.Property_implementation<V> implements jlo.graph.WiredWeightedAssociationEnd.object<V,E> {
         public object_implementation(V value) {
            super(value);
        }

         public object_implementation(V value, boolean notUsed) {
            super(value, notUsed);
        }

    }

    public V object() {
        return object__component__lkjkberfuncye__().getValue();
    }

    public object<V,E> object;

    public jlo.association.AssociationEnd<E> __select$edge(V argument) {
        throw new java.lang.Error();
    }

    public jlo.graph.WiredWeightedEdge<V,E> __select$weightedEdge(E argument) {
        throw new java.lang.Error();
    }

}