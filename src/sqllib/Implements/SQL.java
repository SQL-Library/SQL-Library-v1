package sqllib.Implements;

import sqllib.Secrets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

abstract class SQL {

    public Secrets secrets = new Secrets();

    public void SQLCommand(String query) {
        try {
            // get a connection to database
            Connection connection = DriverManager.getConnection(secrets.getUrl(), secrets.getUsername(), secrets.getPassword());

            // create a statement
            Statement statement = connection.createStatement();

            // insert data into database
            statement.executeUpdate(query);

            // close connection to server
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
