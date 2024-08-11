package io.arif.learn.bridge;

public class MySQLDataSource implements DataSource {
    @Override
    public String getConnectionUrl() {
        return "mysql-connection-url";
    }

    @Override
    public String getUserName() {
        return "username";
    }

    @Override
    public String type() {
        return "sql";
    }
}
