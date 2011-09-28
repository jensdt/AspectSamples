package jlo.sync;

import java.lang.*;
import java.util.concurrent.Semaphore;

public abstract class RendezVous_implementation extends java.lang.Object implements jlo.sync.RendezVous {
     public RendezVous_implementation() {
        super();
        _semaphore = new java.util.concurrent.Semaphore(0);
    }

    public java.util.concurrent.Semaphore semaphore() {
        return _semaphore;
    }

    public java.util.concurrent.Semaphore _semaphore;

    public void acquire() throws java.lang.InterruptedException {
        _semaphore.acquire();
    }

    abstract public jlo.sync.RendezVous other() ;

    public void execute() throws java.lang.InterruptedException {
        before();
        semaphore().release();
        other().acquire();
        after();
    }

    public abstract void before() ;

    public abstract void after() ;

}