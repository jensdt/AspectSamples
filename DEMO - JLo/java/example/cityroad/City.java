package example.cityroad;

import java.lang.*;
import jlo.association.WiredMultiAssociationEnd;
import jlo.graph.WeightedDigraphNode;
import jlo.association.TransitiveAssociationEnd;
import jlo.association.Property;
import jlo.graph.WeightedTransitiveAssociationEnd;
import java.util.List;
import java.util.ArrayList;
import jlo.association.SingleAssociationEnd;
import jlo.association.AssociationEnd;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;
import jlo.tuple.Pair;
import java.util.PriorityQueue;

public  interface City {
;

    public java.lang.String toString() ;

;

;

;

;

;

    public java.lang.String example_cityroad_City_toString() ;

    abstract static public  interface example_cityroad_City_inhabitants_constructor {
        abstract public example.cityroad.City.inhabitants construct(java.lang.Object object) ;

    }

    abstract static public  interface example_cityroad_City_inhabitants_constructorInteger {
        abstract public example.cityroad.City.inhabitants construct(java.lang.Object objectafrkuscggfjsdk, java.lang.Integer value) ;

    }

    abstract static public  interface example_cityroad_City_name_constructor {
        abstract public example.cityroad.City.name construct(java.lang.Object object) ;

    }

    abstract static public  interface example_cityroad_City_name_constructorString {
        abstract public example.cityroad.City.name construct(java.lang.Object objectafrkuscggfjsdk, java.lang.String value) ;

    }

    abstract static public  interface example_cityroad_City_outgoing_constructor {
        abstract public example.cityroad.City.outgoing construct(java.lang.Object object) ;

    }

    abstract static public  interface example_cityroad_City_outgoing_constructorCity {
        abstract public example.cityroad.City.outgoing construct(java.lang.Object objectafrkuscggfjsdk, example.cityroad.City object) ;

    }

    abstract static public  interface example_cityroad_City_incoming_constructor {
        abstract public example.cityroad.City.incoming construct(java.lang.Object object) ;

    }

    abstract static public  interface example_cityroad_City_incoming_constructorCity {
        abstract public example.cityroad.City.incoming construct(java.lang.Object objectafrkuscggfjsdk, example.cityroad.City object) ;

    }

    abstract static public  interface example_cityroad_City_cityTocityOne_constructor {
        abstract public example.cityroad.City.cityTocityOne construct(java.lang.Object object) ;

    }

    abstract static public  interface example_cityroad_City_cityTocityOne_constructorCity {
        abstract public example.cityroad.City.cityTocityOne construct(java.lang.Object objectafrkuscggfjsdk, example.cityroad.City object) ;

    }

    abstract static public  interface example_cityroad_City_cityTocityTwo_constructor {
        abstract public example.cityroad.City.cityTocityTwo construct(java.lang.Object object) ;

    }

    abstract static public  interface example_cityroad_City_cityTocityTwo_constructorCity {
        abstract public example.cityroad.City.cityTocityTwo construct(java.lang.Object objectafrkuscggfjsdk, example.cityroad.City object) ;

    }

    abstract static public  interface example_cityroad_City_graph_constructor {
        abstract public example.cityroad.City.graph construct(java.lang.Object object) ;

    }

    abstract static public  interface example_cityroad_City_graph_constructorCity {
        abstract public example.cityroad.City.graph construct(java.lang.Object objectafrkuscggfjsdk, example.cityroad.City v) ;

    }

    public inhabitants inhabitants__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____inhabitants(inhabitants inhabitants) ;

    public  interface inhabitants extends jlo.association.Property<java.lang.Integer> {
    }

    public java.lang.Integer numberOfInhabitants() ;

    public name name__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____name(name name) ;

    public  interface name extends jlo.association.Property<java.lang.String> {
    }

    public java.lang.String name() ;

    public outgoing outgoing__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____outgoing(outgoing outgoing) ;

    public  interface outgoing extends jlo.association.WiredMultiAssociationEnd<example.cityroad.City,example.cityroad.Road> {
        public jlo.association.BidiAssociationEnd<example.cityroad.Road,example.cityroad.City> __select$otherEnd(example.cityroad.Road argument) ;

    }

    public void addRouteTo(example.cityroad.Road to) ;

    public incoming incoming__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____incoming(incoming incoming) ;

    public  interface incoming extends jlo.association.WiredMultiAssociationEnd<example.cityroad.City,example.cityroad.Road> {
        public jlo.association.BidiAssociationEnd<example.cityroad.Road,example.cityroad.City> __select$otherEnd(example.cityroad.Road argument) ;

    }

    public void addRouteFrom(example.cityroad.Road to) ;

    public cityTocityOne cityTocityOne__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____cityTocityOne(cityTocityOne cityTocityOne) ;

    public  interface cityTocityOne extends jlo.graph.WeightedTransitiveAssociationEnd<example.cityroad.City,example.cityroad.Road> {
        public jlo.association.AssociationEnd<example.cityroad.Road> __select$first(example.cityroad.City argument) ;

        public jlo.association.SingleAssociationEnd<example.cityroad.City> __select$second(example.cityroad.Road argument) ;

        public jlo.association.SingleAssociationEnd<java.lang.Double> __select$weight(example.cityroad.Road argument) ;

    }

    public cityTocityTwo cityTocityTwo__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____cityTocityTwo(cityTocityTwo cityTocityTwo) ;

    public  interface cityTocityTwo extends jlo.graph.WeightedTransitiveAssociationEnd<example.cityroad.City,example.cityroad.Road> {
        public jlo.association.AssociationEnd<example.cityroad.Road> __select$first(example.cityroad.City argument) ;

        public jlo.association.SingleAssociationEnd<example.cityroad.City> __select$second(example.cityroad.Road argument) ;

        public jlo.association.SingleAssociationEnd<java.lang.Double> __select$weight(example.cityroad.Road argument) ;

    }

    public graph graph__component__lkjkberfuncye__() ;

    public void set__component__lkjkberfuncye____graph(graph graph) ;

    public  interface graph extends jlo.graph.WeightedDigraphNode<example.cityroad.City,example.cityroad.Road> {
        public java.util.List<? extends jlo.graph.WeightedAssociationEnd<example.cityroad.City,example.cityroad.Road>> __select$connections(example.cityroad.City argument) ;

    }

    public boolean canReach(example.cityroad.City t) ;

    public java.util.Set<example.cityroad.City> reachables() ;

    public double distanceTo(example.cityroad.City v) ;

}