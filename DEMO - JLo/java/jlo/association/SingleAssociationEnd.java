package jlo.association;

import java.lang.*;

 public  interface SingleAssociationEnd<TO> extends jlo.association.AssociationEnd<TO> {
    public TO getOtherEnd() ;

}