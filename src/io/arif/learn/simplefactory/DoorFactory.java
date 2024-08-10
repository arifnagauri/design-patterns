package io.arif.learn.simplefactory;

/**
 * The Simple factory pattern  describes a class that has one creation method with a large conditional that based on
 * method parameters chooses which product class to instantiate and then return.
 */
public class DoorFactory {

    public static Door getDoor(float length, float height, String material) {
        return new Door(length, height, material);
    }
}

class Door {
    float length;
    float height;
    String material;

    Door(float length, float height, String material) {
        //...
    }

    //...
}
