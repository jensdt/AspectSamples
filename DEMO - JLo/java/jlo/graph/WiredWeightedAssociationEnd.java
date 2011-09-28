package jlo.graph;

import java.lang.*;
import jlo.association.AssociationEnd;
import jlo.association.Property;
import java.util.List;
import java.util.ArrayList;

public  interface WiredWeightedAssociationEnd<V,E> extends jlo.graph.WeightedAssociationEnd<V,E> {
    public java.util.List<V> getObjects() ;

    public java.lang.Double weight(E e) ;

    public V otherEnd(V v, E e) ;

    public java.util.List<E> edges() ;

    public java.util.List<V> jlo_graph_WiredWeightedAssociationEnd_getObjects() ;

    public java.lang.Double jlo_graph_WiredWeightedAssociationEnd_weight(E e) ;

    public V jlo_graph_WiredWeightedAssociationEnd_otherEnd(V v, E e) ;

    public java.util.List<E> jlo_graph_WiredWeightedAssociationEnd_edges() ;

    abstract static public  interface jlo_graph_WiredWeightedAssociationEnd_object_constructor {
        abstract public jlo.graph.WiredWeightedAssociationEnd.object construct(java.lang.Object object) ;

    }

    abstract static public  interface jlo_graph_WiredWeightedAssociationEnd_object_constructorV<V,E> {
        abstract public jlo.graph.WiredWeightedAssociationEnd.object construct(java.lang.Object objectafrkuscggfjsdk, V value) ;

    }

    public object<V,E> object__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____object(object<V,E> object) ;

    public  interface object<V,E> extends jlo.association.Property<V> {
    }

    public V object() ;

    public jlo.association.AssociationEnd<E> __select$edge(V argument) ;

    public jlo.graph.WiredWeightedEdge<V,E> __select$weightedEdge(E argument) ;

}