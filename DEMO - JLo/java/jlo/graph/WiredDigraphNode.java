package jlo.graph;

import java.lang.*;
import jlo.function.Function;
import jlo.association.AssociationEnd;
import jlo.association.Property;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public  interface WiredDigraphNode<T> extends jlo.graph.DigraphNode<T> {
    public T object() ;

    public java.util.Set<T> directSuccessors(T t) ;

    public T jlo_graph_WiredDigraphNode_object() ;

    public java.util.Set<T> jlo_graph_WiredDigraphNode_directSuccessors(T t) ;

    abstract static public  interface jlo_graph_WiredDigraphNode_object_constructor {
        abstract public jlo.graph.WiredDigraphNode.object construct(java.lang.Object object) ;

    }

    abstract static public  interface jlo_graph_WiredDigraphNode_object_constructorT<T> {
        abstract public jlo.graph.WiredDigraphNode.object construct(java.lang.Object objectafrkuscggfjsdk, T value) ;

    }

    public object<T> object__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____object(object<T> object) ;

    public  interface object<T> extends jlo.association.Property<T> {
    }

    public T getObject() ;

    public java.util.List<? extends jlo.association.AssociationEnd<T>> __select$connections(T argument) ;

}