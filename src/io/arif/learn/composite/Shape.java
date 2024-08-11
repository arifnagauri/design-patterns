package io.arif.learn.composite;

import java.awt.*;

/**
 * Common interface shared among shapes and CompoundShape
 */
public interface Shape {

    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);

}
