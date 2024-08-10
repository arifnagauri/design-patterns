package io.arif.learn.prototype;

public class Circle implements Shape {

    private float radius;

    @Override
    public Shape clone() {
        Circle newCircle = new Circle();
        newCircle.radius = radius;
        return newCircle;
    }
}
