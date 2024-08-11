package io.arif.learn.adapter;

/**
 * Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate and
 * decouple external code from our code and facilitates only single point of refactoring, if required (i.e. this class)
 */
public class ServiceAdapter implements InternalService {

    private ExternalService externalService;

    // constructors and setters/getters...

    @Override
    public void method1(/* arguments... */) {
        // some operations which make things compatible with externalService and delegates call to
        // externalService.someMethod();
    }

}
