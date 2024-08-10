package io.arif.learn.factorymethod;

public class ITDepartment extends Department {

    @Override
    protected Employee getEmployee() {
        return new SoftwareEngineer();
    }

    // it-department specific implementation methods
}
