package com.antra.sep.demo;

public class Apple{
    private String colorPrivate;
    public String colorPublic;
    protected String colorProtected;

    public Apple() {
    }

    public Apple(String colorPrivate, String colorPublic, String colorProtected) {
        this.colorPrivate = colorPrivate;
        this.colorPublic = colorPublic;
        this.colorProtected = colorProtected;
    }

    @Antra
    public int aMethod(String input) {
        return 1;
    }

    @Antra // call the method
    private String bMethod(String input) {
        System.out.println(input);
        return "you give me an input of : " + input;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "colorPrivate='" + colorPrivate + '\'' +
                ", colorPublic='" + colorPublic + '\'' +
                ", colorProtected='" + colorProtected + '\'' +
                '}';
    }
}
