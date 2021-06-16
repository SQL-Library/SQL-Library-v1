package sqllib;

public class Create extends SQL implements  Creatable{

    public void createNewTable(String query) {
        // create new table, add more parameters to method for attributes about the table
        SQLCommand(query);
    }

    public void createNewObject(String query) {

    }
}
