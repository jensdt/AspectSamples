package jlo.graph;

import java.lang.*;
import java.util.TreeSet;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import jlo.tuple.Pair;
import java.util.PriorityQueue;

public class WeightedDigraphNode_implementation<V,E> extends jlo.graph.WiredDigraphNode_implementation<V> implements jlo.graph.WeightedDigraphNode<V,E> {
     public WeightedDigraphNode_implementation(V v) {
        super(v, null, null);
    }

    public double shortestDistanceTo(V v) {
        java.util.Set<V> done = new java.util.HashSet<V>();
        java.util.PriorityQueue<MyPair<V>> distances = new java.util.PriorityQueue<MyPair<V>>();
        MyPair<V> uPair = new MyPair_implementation<V>(0d, object());
        while ((uPair) != (null)) {
            V u = uPair.right();
            if(u.equals(v)) {
                return uPair.left();
            }
            if(!(done.contains(u))) {
                done.add(u);
                double distance = uPair.left();
                java.util.List<? extends jlo.graph.WeightedAssociationEnd<V,E>> as = __select$connections(u);
                for (jlo.graph.WeightedAssociationEnd<V,E> a: as) {
                    java.util.List<E> edges = a.edges();
                    for (E edge: edges) {
                        V target = a.otherEnd(u, edge);
                        if(!(done.contains(target))) {
                            double newDistance = (distance) + (((double)(a.weight(edge))));
                            MyPair newPair = new MyPair_implementation(newDistance, target);
                            distances.add(newPair);
                        }
                    }
                }
            }
            uPair = distances.poll();
        }
        return -(1d);
    }

    static public class MyPair_implementation<T> implements java.lang.Comparable<MyPair>, jlo.graph.WeightedDigraphNode.MyPair<T> {
         public MyPair_implementation(double d, T v) {
            super();
            _d = d;
            _v = v;
        }

        public double left() {
            return _d;
        }

        public double _d;

        public T right() {
            return _v;
        }

        public T _v;

        public int hashCode() {
            return ((int)(_d));
        }

        public boolean equals(java.lang.Object other) {
            if((other instanceof MyPair)) {
                return (((MyPair)(other)).left()) == (left());
            }
            else {
                return false;
            }
        }

        public int compareTo(MyPair other) {
            double first = left();
            double second = other.left();
            if((first) < (second)) {
                return -(1);
            }
            else if((first) == (second)) {
                return 0;
            }
            else {
                return 1;
            }
        }

        public int jlo_graph_WeightedDigraphNode_MyPair_hashCode() {
            return ((int)(_d));
        }

        public boolean jlo_graph_WeightedDigraphNode_MyPair_equals(java.lang.Object other) {
            if((other instanceof MyPair)) {
                return (((MyPair)(other)).left()) == (left());
            }
            else {
                return false;
            }
        }

        public int jlo_graph_WeightedDigraphNode_MyPair_compareTo(MyPair other) {
            double first = left();
            double second = other.left();
            if((first) < (second)) {
                return -(1);
            }
            else if((first) == (second)) {
                return 0;
            }
            else {
                return 1;
            }
        }

    }

     public WeightedDigraphNode_implementation(V v, jlo_graph_WiredDigraphNode_object_constructor strategyForjlo_graph_WiredDigraphNode_object, jlo_graph_WiredDigraphNode_object_constructorT defaultstrategyForjlo_graph_WiredDigraphNode_object) {
        super(v, strategyForjlo_graph_WiredDigraphNode_object, defaultstrategyForjlo_graph_WiredDigraphNode_object);
    }

    public java.util.List<? extends jlo.graph.WeightedAssociationEnd<V,E>> __select$connections(V argument) {
        throw new java.lang.Error();
    }

}