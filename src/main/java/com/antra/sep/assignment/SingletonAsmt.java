package com.antra.sep.assignment;


public class SingletonAsmt {
    public static void main(String[] args) {
        MySingletonClass obj1 = MySingletonClass.getInstance();
        MySingletonClass obj2 = MySingletonClass.getInstance();
        System.out.println(obj1 == obj2);
    }
}

// Question: Make this class a singleton class
class MySingletonClass {
    public static MySingletonClass getInstance() {
        return new MySingletonClass();
    }
}