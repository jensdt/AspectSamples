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

public class City_implementation extends java.lang.Object implements example.cityroad.City {
     public City_implementation(java.lang.String myName) {
        super();
        set__component__lkjkberfuncye____inhabitants(new inhabitants_implementation(new java.lang.Integer(50000)));
        set__component__lkjkberfuncye____name(new name_implementation(myName));
        set__component__lkjkberfuncye____outgoing(new outgoing_implementation(this));
        set__component__lkjkberfuncye____incoming(new incoming_implementation(this));
        set__component__lkjkberfuncye____graph(new graph_implementation(this));
        set__component__lkjkberfuncye____cityTocityOne(new cityTocityOne_implementation(this));
        set__component__lkjkberfuncye____cityTocityTwo(new cityTocityTwo_implementation(this));
    }

;

    public java.lang.String toString() {
        return name();
    }

;

;

;

;

;

    public java.lang.String example_cityroad_City_toString() {
        return name();
    }

    abstract static public class example_cityroad_City_inhabitants_constructor_implementation implements example.cityroad.City.example_cityroad_City_inhabitants_constructor {
        abstract public example.cityroad.City.inhabitants construct(java.lang.Object object) ;

    }

    abstract static public class example_cityroad_City_inhabitants_constructorInteger_implementation implements example.cityroad.City.example_cityroad_City_inhabitants_constructorInteger {
        abstract public example.cityroad.City.inhabitants construct(java.lang.Object objectafrkuscggfjsdk, java.lang.Integer value) ;

    }

    abstract static public class example_cityroad_City_name_constructor_implementation implements example.cityroad.City.example_cityroad_City_name_constructor {
        abstract public example.cityroad.City.name construct(java.lang.Object object) ;

    }

    abstract static public class example_cityroad_City_name_constructorString_implementation implements example.cityroad.City.example_cityroad_City_name_constructorString {
        abstract public example.cityroad.City.name construct(java.lang.Object objectafrkuscggfjsdk, java.lang.String value) ;

    }

    abstract static public class example_cityroad_City_outgoing_constructor_implementation implements example.cityroad.City.example_cityroad_City_outgoing_constructor {
        abstract public example.cityroad.City.outgoing construct(java.lang.Object object) ;

    }

    abstract static public class example_cityroad_City_outgoing_constructorCity_implementation implements example.cityroad.City.example_cityroad_City_outgoing_constructorCity {
        abstract public example.cityroad.City.outgoing construct(java.lang.Object objectafrkuscggfjsdk, example.cityroad.City object) ;

    }

    abstract static public class example_cityroad_City_incoming_constructor_implementation implements example.cityroad.City.example_cityroad_City_incoming_constructor {
        abstract public example.cityroad.City.incoming construct(java.lang.Object object) ;

    }

    abstract static public class example_cityroad_City_incoming_constructorCity_implementation implements example.cityroad.City.example_cityroad_City_incoming_constructorCity {
        abstract public example.cityroad.City.incoming construct(java.lang.Object objectafrkuscggfjsdk, example.cityroad.City object) ;

    }

    abstract static public class example_cityroad_City_cityTocityOne_constructor_implementation implements example.cityroad.City.example_cityroad_City_cityTocityOne_constructor {
        abstract public example.cityroad.City.cityTocityOne construct(java.lang.Object object) ;

    }

    abstract static public class example_cityroad_City_cityTocityOne_constructorCity_implementation implements example.cityroad.City.example_cityroad_City_cityTocityOne_constructorCity {
        abstract public example.cityroad.City.cityTocityOne construct(java.lang.Object objectafrkuscggfjsdk, example.cityroad.City object) ;

    }

    abstract static public class example_cityroad_City_cityTocityTwo_constructor_implementation implements example.cityroad.City.example_cityroad_City_cityTocityTwo_constructor {
        abstract public example.cityroad.City.cityTocityTwo construct(java.lang.Object object) ;

    }

    abstract static public class example_cityroad_City_cityTocityTwo_constructorCity_implementation implements example.cityroad.City.example_cityroad_City_cityTocityTwo_constructorCity {
        abstract public example.cityroad.City.cityTocityTwo construct(java.lang.Object objectafrkuscggfjsdk, example.cityroad.City object) ;

    }

    abstract static public class example_cityroad_City_graph_constructor_implementation implements example.cityroad.City.example_cityroad_City_graph_constructor {
        abstract public example.cityroad.City.graph construct(java.lang.Object object) ;

    }

    abstract static public class example_cityroad_City_graph_constructorCity_implementation implements example.cityroad.City.example_cityroad_City_graph_constructorCity {
        abstract public example.cityroad.City.graph construct(java.lang.Object objectafrkuscggfjsdk, example.cityroad.City v) ;

    }

     public City_implementation(java.lang.String myName, example_cityroad_City_inhabitants_constructor strategyForexample_cityroad_City_inhabitants, example_cityroad_City_inhabitants_constructorInteger defaultstrategyForexample_cityroad_City_inhabitants, example_cityroad_City_name_constructor strategyForexample_cityroad_City_name, example_cityroad_City_name_constructorString defaultstrategyForexample_cityroad_City_name, example_cityroad_City_outgoing_constructor strategyForexample_cityroad_City_outgoing, example_cityroad_City_outgoing_constructorCity defaultstrategyForexample_cityroad_City_outgoing, example_cityroad_City_incoming_constructor strategyForexample_cityroad_City_incoming, example_cityroad_City_incoming_constructorCity defaultstrategyForexample_cityroad_City_incoming, example_cityroad_City_cityTocityOne_constructor strategyForexample_cityroad_City_cityTocityOne, example_cityroad_City_cityTocityOne_constructorCity defaultstrategyForexample_cityroad_City_cityTocityOne, example_cityroad_City_cityTocityTwo_constructor strategyForexample_cityroad_City_cityTocityTwo, example_cityroad_City_cityTocityTwo_constructorCity defaultstrategyForexample_cityroad_City_cityTocityTwo, example_cityroad_City_graph_constructor strategyForexample_cityroad_City_graph, example_cityroad_City_graph_constructorCity defaultstrategyForexample_cityroad_City_graph) {
        super();
        if((strategyForexample_cityroad_City_inhabitants) == (null)) {
            if((defaultstrategyForexample_cityroad_City_inhabitants) == (null)) {
                set__component__lkjkberfuncye____inhabitants(new inhabitants_implementation(new java.lang.Integer(50000)));
            }
            else {
                set__component__lkjkberfuncye____inhabitants(defaultstrategyForexample_cityroad_City_inhabitants.construct(this, new java.lang.Integer(50000)));
            }
        }
        else {
            set__component__lkjkberfuncye____inhabitants(strategyForexample_cityroad_City_inhabitants.construct(this));
        }
        if((strategyForexample_cityroad_City_name) == (null)) {
            if((defaultstrategyForexample_cityroad_City_name) == (null)) {
                set__component__lkjkberfuncye____name(new name_implementation(myName));
            }
            else {
                set__component__lkjkberfuncye____name(defaultstrategyForexample_cityroad_City_name.construct(this, myName));
            }
        }
        else {
            set__component__lkjkberfuncye____name(strategyForexample_cityroad_City_name.construct(this));
        }
        if((strategyForexample_cityroad_City_outgoing) == (null)) {
            if((defaultstrategyForexample_cityroad_City_outgoing) == (null)) {
                set__component__lkjkberfuncye____outgoing(new outgoing_implementation(this));
            }
            else {
                set__component__lkjkberfuncye____outgoing(defaultstrategyForexample_cityroad_City_outgoing.construct(this, this));
            }
        }
        else {
            set__component__lkjkberfuncye____outgoing(strategyForexample_cityroad_City_outgoing.construct(this));
        }
        if((strategyForexample_cityroad_City_incoming) == (null)) {
            if((defaultstrategyForexample_cityroad_City_incoming) == (null)) {
                set__component__lkjkberfuncye____incoming(new incoming_implementation(this));
            }
            else {
                set__component__lkjkberfuncye____incoming(defaultstrategyForexample_cityroad_City_incoming.construct(this, this));
            }
        }
        else {
            set__component__lkjkberfuncye____incoming(strategyForexample_cityroad_City_incoming.construct(this));
        }
        if((strategyForexample_cityroad_City_graph) == (null)) {
            if((defaultstrategyForexample_cityroad_City_graph) == (null)) {
                set__component__lkjkberfuncye____graph(new graph_implementation(this));
            }
            else {
                set__component__lkjkberfuncye____graph(defaultstrategyForexample_cityroad_City_graph.construct(this, this));
            }
        }
        else {
            set__component__lkjkberfuncye____graph(strategyForexample_cityroad_City_graph.construct(this));
        }
        if((strategyForexample_cityroad_City_cityTocityOne) == (null)) {
            if((defaultstrategyForexample_cityroad_City_cityTocityOne) == (null)) {
                set__component__lkjkberfuncye____cityTocityOne(new cityTocityOne_implementation(this));
            }
            else {
                set__component__lkjkberfuncye____cityTocityOne(defaultstrategyForexample_cityroad_City_cityTocityOne.construct(this, this));
            }
        }
        else {
            set__component__lkjkberfuncye____cityTocityOne(strategyForexample_cityroad_City_cityTocityOne.construct(this));
        }
        if((strategyForexample_cityroad_City_cityTocityTwo) == (null)) {
            if((defaultstrategyForexample_cityroad_City_cityTocityTwo) == (null)) {
                set__component__lkjkberfuncye____cityTocityTwo(new cityTocityTwo_implementation(this));
            }
            else {
                set__component__lkjkberfuncye____cityTocityTwo(defaultstrategyForexample_cityroad_City_cityTocityTwo.construct(this, this));
            }
        }
        else {
            set__component__lkjkberfuncye____cityTocityTwo(strategyForexample_cityroad_City_cityTocityTwo.construct(this));
        }
    }

    public inhabitants inhabitants__component__lkjkberfuncye__() {
        return inhabitants;
    }

    public void set__component__lkjkberfuncye____inhabitants(inhabitants inhabitants) {
        this.inhabitants = inhabitants;
    }

    public class inhabitants_implementation extends jlo.association.Property_implementation<java.lang.Integer> implements example.cityroad.City.inhabitants {
         public inhabitants_implementation(java.lang.Integer value) {
            super(value);
        }

         public inhabitants_implementation(java.lang.Integer value, boolean notUsed) {
            super(value, notUsed);
        }

    }

    public java.lang.Integer numberOfInhabitants() {
        return inhabitants__component__lkjkberfuncye__().getValue();
    }

    public name name__component__lkjkberfuncye__() {
        return name;
    }

    public void set__component__lkjkberfuncye____name(name name) {
        this.name = name;
    }

    public class name_implementation extends jlo.association.Property_implementation<java.lang.String> implements example.cityroad.City.name {
         public name_implementation(java.lang.String value) {
            super(value);
        }

         public name_implementation(java.lang.String value, boolean notUsed) {
            super(value, notUsed);
        }

    }

    public java.lang.String name() {
        return name__component__lkjkberfuncye__().getValue();
    }

    public outgoing outgoing__component__lkjkberfuncye__() {
        return outgoing;
    }

    public void set__component__lkjkberfuncye____outgoing(outgoing outgoing) {
        this.outgoing = outgoing;
    }

    public class outgoing_implementation extends jlo.association.WiredMultiAssociationEnd_implementation<example.cityroad.City,example.cityroad.Road> implements example.cityroad.City.outgoing {
        public jlo.association.BidiAssociationEnd<example.cityroad.Road,example.cityroad.City> __select$otherEnd(example.cityroad.Road argument) {
            return argument.start__component__lkjkberfuncye__();
        }

         public outgoing_implementation(example.cityroad.City object) {
            super(object);
        }

    }

    public void addRouteTo(example.cityroad.Road to) {
        outgoing__component__lkjkberfuncye__().add(to);
    }

    public incoming incoming__component__lkjkberfuncye__() {
        return incoming;
    }

    public void set__component__lkjkberfuncye____incoming(incoming incoming) {
        this.incoming = incoming;
    }

    public class incoming_implementation extends jlo.association.WiredMultiAssociationEnd_implementation<example.cityroad.City,example.cityroad.Road> implements example.cityroad.City.incoming {
        public jlo.association.BidiAssociationEnd<example.cityroad.Road,example.cityroad.City> __select$otherEnd(example.cityroad.Road argument) {
            return argument.end__component__lkjkberfuncye__();
        }

         public incoming_implementation(example.cityroad.City object) {
            super(object);
        }

    }

    public void addRouteFrom(example.cityroad.Road to) {
        incoming__component__lkjkberfuncye__().add(to);
    }

    public cityTocityOne cityTocityOne__component__lkjkberfuncye__() {
        return cityTocityOne;
    }

    public void set__component__lkjkberfuncye____cityTocityOne(cityTocityOne cityTocityOne) {
        this.cityTocityOne = cityTocityOne;
    }

    public class cityTocityOne_implementation extends jlo.graph.WeightedTransitiveAssociationEnd_implementation<example.cityroad.City,example.cityroad.Road> implements example.cityroad.City.cityTocityOne {
        public jlo.association.AssociationEnd<example.cityroad.Road> __select$first(example.cityroad.City argument) {
            return argument.outgoing__component__lkjkberfuncye__();
        }

        public jlo.association.SingleAssociationEnd<example.cityroad.City> __select$second(example.cityroad.Road argument) {
            return argument.end__component__lkjkberfuncye__();
        }

        public jlo.association.SingleAssociationEnd<java.lang.Double> __select$weight(example.cityroad.Road argument) {
            return argument.length__component__lkjkberfuncye__();
        }

         public cityTocityOne_implementation(example.cityroad.City object) {
            super(object, null, null);
        }

         public cityTocityOne_implementation(example.cityroad.City object, jlo_association_TransitiveAssociationEnd_object_constructor strategyForjlo_association_TransitiveAssociationEnd_object, jlo_association_TransitiveAssociationEnd_object_constructorFROM defaultstrategyForjlo_association_TransitiveAssociationEnd_object) {
            super(object, strategyForjlo_association_TransitiveAssociationEnd_object, defaultstrategyForjlo_association_TransitiveAssociationEnd_object);
        }

    }

    public cityTocityTwo cityTocityTwo__component__lkjkberfuncye__() {
        return cityTocityTwo;
    }

    public void set__component__lkjkberfuncye____cityTocityTwo(cityTocityTwo cityTocityTwo) {
        this.cityTocityTwo = cityTocityTwo;
    }

    public class cityTocityTwo_implementation extends jlo.graph.WeightedTransitiveAssociationEnd_implementation<example.cityroad.City,example.cityroad.Road> implements example.cityroad.City.cityTocityTwo {
        public jlo.association.AssociationEnd<example.cityroad.Road> __select$first(example.cityroad.City argument) {
            return argument.incoming__component__lkjkberfuncye__();
        }

        public jlo.association.SingleAssociationEnd<example.cityroad.City> __select$second(example.cityroad.Road argument) {
            return argument.start__component__lkjkberfuncye__();
        }

        public jlo.association.SingleAssociationEnd<java.lang.Double> __select$weight(example.cityroad.Road argument) {
            return argument.length__component__lkjkberfuncye__();
        }

         public cityTocityTwo_implementation(example.cityroad.City object) {
            super(object, null, null);
        }

         public cityTocityTwo_implementation(example.cityroad.City object, jlo_association_TransitiveAssociationEnd_object_constructor strategyForjlo_association_TransitiveAssociationEnd_object, jlo_association_TransitiveAssociationEnd_object_constructorFROM defaultstrategyForjlo_association_TransitiveAssociationEnd_object) {
            super(object, strategyForjlo_association_TransitiveAssociationEnd_object, defaultstrategyForjlo_association_TransitiveAssociationEnd_object);
        }

    }

    public graph graph__component__lkjkberfuncye__() {
        return graph;
    }

    public void set__component__lkjkberfuncye____graph(graph graph) {
        this.graph = graph;
    }

    public class graph_implementation extends jlo.graph.WeightedDigraphNode_implementation<example.cityroad.City,example.cityroad.Road> implements example.cityroad.City.graph {
        public java.util.List<? extends jlo.graph.WeightedAssociationEnd<example.cityroad.City,example.cityroad.Road>> __select$connections(example.cityroad.City argument) {
            java.util.ArrayList result = new java.util.ArrayList();
            result.add(argument.cityTocityOne__component__lkjkberfuncye__());
            result.add(argument.cityTocityTwo__component__lkjkberfuncye__());
            return result;
        }

         public graph_implementation(example.cityroad.City v) {
            super(v, null, null);
        }

         public graph_implementation(example.cityroad.City v, jlo_graph_WiredDigraphNode_object_constructor strategyForjlo_graph_WiredDigraphNode_object, jlo_graph_WiredDigraphNode_object_constructorT defaultstrategyForjlo_graph_WiredDigraphNode_object) {
            super(v, strategyForjlo_graph_WiredDigraphNode_object, defaultstrategyForjlo_graph_WiredDigraphNode_object);
        }

    }

    public boolean canReach(example.cityroad.City t) {
        return graph__component__lkjkberfuncye__().predecessorOf(t);
    }

    public java.util.Set<example.cityroad.City> reachables() {
        return graph__component__lkjkberfuncye__().successors();
    }

    public double distanceTo(example.cityroad.City v) {
        return graph__component__lkjkberfuncye__().shortestDistanceTo(v);
    }

    public inhabitants inhabitants;

    public name name;

    public outgoing outgoing;

    public incoming incoming;

    public cityTocityOne cityTocityOne;

    public cityTocityTwo cityTocityTwo;

    public graph graph;

}