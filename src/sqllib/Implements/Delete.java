package sqllib.Implements;

import sqllib.Secrets;

public class Delete extends SQL {

    public void deleteTable(String tableName, Secrets credentials) {
            String query = String.format("DROP TABLE %s", tableName);
            SQLCommand(query, credentials);
    }
}
