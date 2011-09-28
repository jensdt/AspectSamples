package jlo.graph;

import java.lang.*;
import java.util.Set;
import java.util.HashSet;

public abstract class DigraphNode_implementation<T> extends java.lang.Object implements jlo.graph.DigraphNode<T> {
    public abstract T object() ;

    abstract public java.util.Set<T> directSuccessors(T t) ;

    public java.util.Set<T> directSuccessors() {
        return directSuccessors(object());
    }

    public java.util.Set<T> successors() {
        java.util.Set<T> result = new java.util.HashSet<T>();
        accumulateSuccessors(object(), result);
        return result;
    }

    public void accumulateSuccessors(T t, java.util.Set<T> accumulator) {
        java.util.Set<T> outs = directSuccessors(t);
        for (T newT: outs) {
            if(!(accumulator.contains(newT))) {
                accumulator.add(newT);
                accumulateSuccessors(newT, accumulator);
            }
        }
    }

    public boolean predecessorOf(T t) {
        return successors().contains(t);
    }

     public DigraphNode_implementation() {
        super();
    }

}