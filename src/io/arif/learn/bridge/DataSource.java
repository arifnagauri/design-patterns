package io.arif.learn.bridge;

public interface DataSource {

    String getConnectionUrl();
    String getUserName();
    String type();
    // etc...
}
