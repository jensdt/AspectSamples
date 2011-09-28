package jlo.graph;

import java.lang.*;
import java.util.TreeSet;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import jlo.tuple.Pair;
import java.util.PriorityQueue;

public  interface WeightedDigraphNode<V,E> extends jlo.graph.WiredDigraphNode<V> {
    public double shortestDistanceTo(V v) ;

    static public  interface MyPair<T> extends java.lang.Comparable<MyPair> {
        public double left() ;

        public T right() ;

        public int hashCode() ;

        public boolean equals(java.lang.Object other) ;

        public int compareTo(MyPair other) ;

        public int jlo_graph_WeightedDigraphNode_MyPair_hashCode() ;

        public boolean jlo_graph_WeightedDigraphNode_MyPair_equals(java.lang.Object other) ;

        public int jlo_graph_WeightedDigraphNode_MyPair_compareTo(MyPair other) ;

    }

    public java.util.List<? extends jlo.graph.WeightedAssociationEnd<V,E>> __select$connections(V argument) ;

}