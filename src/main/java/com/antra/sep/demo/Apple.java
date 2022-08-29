package com.antra.sep.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Apple {
 // no field . no updatable fields    -   stateless class

    public AtomicInteger counter ;
    public volatile Object lock;
    public void increaseCounter() {
        synchronized (lock) {
            counter.incrementAndGet();
        }
    }

   public synchronized void increaseCounte2(){}

}
