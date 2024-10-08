package io.arif.learn.singleton;

public  class Singleton {

    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Singleton();

        return INSTANCE;
    }

    // other business logic methods...
}