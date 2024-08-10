package io.arif.learn.prototype;

public class Rectangle implements Shape{

    private float length;
    private float breadth;


    @Override
    public Shape clone() {
        Rectangle newRectangle = new Rectangle();
        newRectangle.length = this.length;
        newRectangle.breadth = this.breadth;
        return newRectangle;
    }
}
