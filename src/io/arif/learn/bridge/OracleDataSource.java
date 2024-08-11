package io.arif.learn.bridge;

public class OracleDataSource implements DataSource {

    @Override
    public String getConnectionUrl() {
        return "oracle-connection-url";
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
