package example.cityroad;

import java.lang.*;

public class Main_implementation extends java.lang.Object implements example.cityroad.Main {
    public static void main(java.lang.String[] args) {
        example.cityroad.City leuven = new example.cityroad.City_implementation("Leuven");
        example.cityroad.City lille = new example.cityroad.City_implementation("Lille");
        example.cityroad.City brussels = new example.cityroad.City_implementation("Brussels");
        example.cityroad.City antwerp = new example.cityroad.City_implementation("Antwerp");
        example.cityroad.City dendermonde = new example.cityroad.City_implementation("Dendermonde");
        example.cityroad.City mechelen = new example.cityroad.City_implementation("Mechelen");
        example.cityroad.City lokeren = new example.cityroad.City_implementation("Lokeren");
        example.cityroad.City liege = new example.cityroad.City_implementation("Liege");
        example.cityroad.City namur = new example.cityroad.City_implementation("Namur");
        example.cityroad.City charleroi = new example.cityroad.City_implementation("Charleroi");
        example.cityroad.City ghent = new example.cityroad.City_implementation("Ghent");
        example.cityroad.City ninove = new example.cityroad.City_implementation("Ninove");
        example.cityroad.City oudenaarde = new example.cityroad.City_implementation("Oudenaarde");
        example.cityroad.City kortrijk = new example.cityroad.City_implementation("Kortrijk");
        new example.cityroad.Road_implementation(16d, brussels, leuven);
        new example.cityroad.Road_implementation(40d, leuven, liege);
        new example.cityroad.Road_implementation(40d, leuven, namur);
        new example.cityroad.Road_implementation(30d, leuven, mechelen);
        new example.cityroad.Road_implementation(25d, liege, namur);
        new example.cityroad.Road_implementation(10d, brussels, mechelen);
        new example.cityroad.Road_implementation(25d, brussels, dendermonde);
        new example.cityroad.Road_implementation(20d, brussels, ghent);
        new example.cityroad.Road_implementation(20d, brussels, ninove);
        new example.cityroad.Road_implementation(50d, brussels, lille);
        new example.cityroad.Road_implementation(30d, brussels, charleroi);
        new example.cityroad.Road_implementation(25d, namur, charleroi);
        new example.cityroad.Road_implementation(60d, lille, charleroi);
        new example.cityroad.Road_implementation(35d, oudenaarde, ninove);
        new example.cityroad.Road_implementation(25d, oudenaarde, ghent);
        new example.cityroad.Road_implementation(30d, oudenaarde, kortrijk);
        new example.cityroad.Road_implementation(15d, lille, kortrijk);
        new example.cityroad.Road_implementation(25d, ghent, kortrijk);
        new example.cityroad.Road_implementation(10d, ghent, lokeren);
        new example.cityroad.Road_implementation(30d, antwerp, lokeren);
        new example.cityroad.Road_implementation(15d, dendermonde, lokeren);
        example.cityroad.Road r = new example.cityroad.Road_implementation(10d, antwerp, mechelen);
        System.out.println(("Name: ") + (Logger_implementation.instance().<java.lang.String>advice_edzaaygw_fzdoczvr(leuven.name__component__lkjkberfuncye__(), "getValue", new java.lang.Object[]{}, null)));
        System.out.println(("Inhabitants: ") + (Logger_implementation.instance().advice_fepctmya_dpieodtr(leuven, null).getValue()));
        massert((((double)(r.length()))) == (10d));
        massert(Logger_implementation.instance().<java.lang.Boolean>advice_gedvmfvz_xbfwkbji(leuven, "canReach", new java.lang.Object[]{lille}, null));
        massert(Logger_implementation.instance().<java.lang.Boolean>advice_gedvmfvz_uguuprgo(lille, "canReach", new java.lang.Object[]{leuven}, null));
        massert((leuven.distanceTo(lille)) == (66d));
        massert((antwerp.distanceTo(liege)) == (76d));
        massert((lille.distanceTo(liege)) == (106d));
        massert((brussels.distanceTo(oudenaarde)) == (45d));
        massert((lokeren.distanceTo(ninove)) == (50d));
        System.out.println("Tests succeeded.");
    }

    public static void massert(boolean bool) {
        if(!(bool)) {
            throw new java.lang.Error();
        }
    }

     public Main_implementation() {
        super();
    }

}