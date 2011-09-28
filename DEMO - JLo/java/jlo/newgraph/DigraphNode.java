package jlo.newgraph;

import java.lang.*;
import java.util.Set;
import java.util.HashSet;

public abstract  interface DigraphNode<T> {
    public abstract T object() ;

    abstract public java.util.Set<jlo.newgraph.DigraphNode<T>> directSuccessorNodes() ;

    public java.util.Set<T> directSuccessors() ;

    public java.util.Set<T> successors() ;

    public void accumulateSuccessors(T t, java.util.Set<T> accumulator) ;

    public boolean predecessorOf(T t) ;

}