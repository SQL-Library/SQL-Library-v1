package com.apinanyogaratnam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Create {

    private Secrets secrets = new Secrets();

    public void createNewTable(String query) {
        try {
            Connection connection = DriverManager.getConnection(secrets.getUrl(), secrets.getUsername(), secrets.getPassword());
            Statement statement = connection.createStatement();

            // create new table, add more parameters to method for attributes about the table
            statement.executeUpdate(query);

            // close connection to db
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
