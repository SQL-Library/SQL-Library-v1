package com.apinanyogaratnam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Create {
    Secrets secrets = new Secrets();
    public void createNewTable(String query) {
        try {
            Connection connection = DriverManager.getConnection(secrets.getUrl(), secrets.getUsername(), secrets.getPassword());
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);

            // close connection to db
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
