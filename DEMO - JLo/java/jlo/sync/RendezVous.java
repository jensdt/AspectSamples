package jlo.sync;

import java.lang.*;
import java.util.concurrent.Semaphore;

public abstract  interface RendezVous {
    public java.util.concurrent.Semaphore semaphore() ;

    public void acquire() throws java.lang.InterruptedException ;

    abstract public jlo.sync.RendezVous other() ;

    public void execute() throws java.lang.InterruptedException ;

    public abstract void before() ;

    public abstract void after() ;

}