package io.arif.learn.abstractfactory;

public class ClassicFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }

    @Override
    public DiningTable createDiningTable() {
        return new ClassicDiningTable();
    }
}
