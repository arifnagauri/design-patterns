package io.arif.learn.factorymethod;

public abstract class Department {
    int depId;
    String name;

    protected abstract Employee getEmployee();
}
