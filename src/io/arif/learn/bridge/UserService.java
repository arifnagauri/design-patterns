package io.arif.learn.bridge;

public class UserService {

    private final UserDAO userDAO;

    public UserService() {
        DataSource dataSource = new OracleDataSource();
        this.userDAO = new UserDAO(dataSource);
    }

    public void doUserTableOperation() {
        //...
    }
}
