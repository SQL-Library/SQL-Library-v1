package com.apinanyogaratnam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

abstract class SQL {

    Secrets secrets = new Secrets();

    public void SQLCommand(String query) {
        try {
            // get a connection to database
//            Connection connection = DriverManager.getConnection(secrets.getUrl(), secrets.getUsername(), secrets.getPassword());

            // create a statement
//            Statement statement = connection.createStatement();

            // insert data into database
//            statement.executeUpdate(query);
            System.out.println(query);

            // close connection to server
//            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
