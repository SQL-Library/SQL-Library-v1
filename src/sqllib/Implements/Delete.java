package sqllib.Implements;

public class Delete extends SQL {

    public void deleteTable(String tableName) {
            String query = String.format("DROP TABLE %s", tableName);
            SQLCommand(query);
    }

}
