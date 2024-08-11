package io.arif.learn.bridge;

/**
 * can be extended by any number of subclasses
 */
public class BaseDAO {
    //establish a bridge between dao and data-source
    private final DataSource dataSource;

    public BaseDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void doCommonOperation1() {
    }

    public void doCommonOperation2() {
    }

    // ...
}
