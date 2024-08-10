package io.arif.learn.prototype;

public interface Shape extends Cloneable {

//    double getArea();

    // to force all shapes to implement clone, since Object#clone only does shallow copy
    Shape clone();

}
