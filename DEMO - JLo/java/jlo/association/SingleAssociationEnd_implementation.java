package jlo.association;

import java.lang.*;

 public interface SingleAssociationEnd_implementation<TO> extends jlo.association.AssociationEnd_implementation<TO>, jlo.association.SingleAssociationEnd<TO> {
    public TO getOtherEnd() ;

}