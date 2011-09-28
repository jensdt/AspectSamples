package jlo.function;

import java.lang.*;

 public interface Function_implementation<A,R> extends jlo.function.Function<A,R> {
    public R eval(A arg) ;

}