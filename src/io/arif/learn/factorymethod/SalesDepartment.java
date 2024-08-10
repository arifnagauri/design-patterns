package io.arif.learn.factorymethod;

public class SalesDepartment extends Department {

    @Override
    protected Employee getEmployee() {
        return new SalesExecutive();
    }

    // sales-department specific implementation methods
}
