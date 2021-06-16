package com.apinanyogaratnam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete extends SQL{

    public void deleteTable(String tableName) {
            String query = String.format("DROP TABLE %s", tableName);
            SQLCommand(query);
    }

}
