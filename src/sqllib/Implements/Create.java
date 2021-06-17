package sqllib.Implements;

import sqllib.Interfaces.Creatable;

public class Create extends SQL implements Creatable {

    public void createNewTable(String query) {
        SQLCommand(query);
    }

    public void createNewObject(String query) {

    }
}
