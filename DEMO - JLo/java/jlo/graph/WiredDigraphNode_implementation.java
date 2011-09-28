package jlo.graph;

import java.lang.*;
import jlo.function.Function;
import jlo.association.AssociationEnd;
import jlo.association.Property;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class WiredDigraphNode_implementation<T> extends jlo.graph.DigraphNode_implementation<T> implements jlo.graph.WiredDigraphNode<T> {
     public WiredDigraphNode_implementation(T t) {
        super();
        set__component__lkjkberfuncye____object(new object_implementation(t));
    }

    public T object() {
        return getObject();
    }

    public java.util.Set<T> directSuccessors(T t) {
        java.util.List<? extends jlo.association.AssociationEnd<T>> links = __select$connections(t);
        java.util.Set<T> result = new java.util.HashSet<T>();
        for (jlo.association.AssociationEnd<T> link: links) {
            result.addAll(link.getObjects());
        }
        return result;
    }

    public T jlo_graph_WiredDigraphNode_object() {
        return getObject();
    }

    public java.util.Set<T> jlo_graph_WiredDigraphNode_directSuccessors(T t) {
        java.util.List<? extends jlo.association.AssociationEnd<T>> links = __select$connections(t);
        java.util.Set<T> result = new java.util.HashSet<T>();
        for (jlo.association.AssociationEnd<T> link: links) {
            result.addAll(link.getObjects());
        }
        return result;
    }

    abstract static public class jlo_graph_WiredDigraphNode_object_constructor_implementation implements jlo.graph.WiredDigraphNode.jlo_graph_WiredDigraphNode_object_constructor {
        abstract public jlo.graph.WiredDigraphNode.object construct(java.lang.Object object) ;

    }

    abstract static public class jlo_graph_WiredDigraphNode_object_constructorT_implementation<T> implements jlo.graph.WiredDigraphNode.jlo_graph_WiredDigraphNode_object_constructorT<T> {
        abstract public jlo.graph.WiredDigraphNode.object construct(java.lang.Object objectafrkuscggfjsdk, T value) ;

    }

     public WiredDigraphNode_implementation(T t, jlo_graph_WiredDigraphNode_object_constructor strategyForjlo_graph_WiredDigraphNode_object, jlo_graph_WiredDigraphNode_object_constructorT defaultstrategyForjlo_graph_WiredDigraphNode_object) {
        super();
        if((strategyForjlo_graph_WiredDigraphNode_object) == (null)) {
            if((defaultstrategyForjlo_graph_WiredDigraphNode_object) == (null)) {
                set__component__lkjkberfuncye____object(new object_implementation(t));
            }
            else {
                set__component__lkjkberfuncye____object(defaultstrategyForjlo_graph_WiredDigraphNode_object.construct(this, t));
            }
        }
        else {
            set__component__lkjkberfuncye____object(strategyForjlo_graph_WiredDigraphNode_object.construct(this));
        }
    }

    public object<T> object__component__lkjkberfuncye__() {
        return object;
    }

    public void set__component__lkjkberfuncye____object(object<T> object) {
        this.object = object;
    }

    public class object_implementation extends jlo.association.Property_implementation<T> implements jlo.graph.WiredDigraphNode.object<T> {
         public object_implementation(T value) {
            super(value);
        }

         public object_implementation(T value, boolean notUsed) {
            super(value, notUsed);
        }

    }

    public T getObject() {
        return object__component__lkjkberfuncye__().getValue();
    }

    public object<T> object;

    public java.util.List<? extends jlo.association.AssociationEnd<T>> __select$connections(T argument) {
        throw new java.lang.Error();
    }

}