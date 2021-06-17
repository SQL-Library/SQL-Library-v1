package sqllib.Interfaces;

import sqllib.Implements.Delete;

public interface Deletable {

    Delete delete = new Delete();

    static void deleteTable(String query) {
        delete.deleteTable(query);
    }
}
