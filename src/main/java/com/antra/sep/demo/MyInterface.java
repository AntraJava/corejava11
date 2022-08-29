package com.antra.sep.demo;

@FunctionalInterface
public interface MyInterface {

    public abstract int doSomething();

    default int aMethod() {
        //kjsldkfj
        System.out.println("hello");
        return 1;
    }

    private static int bMethod() {
        System.out.println("hello");
        return 0;
    }
}
