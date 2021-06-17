package sqllib.Interfaces;

import sqllib.Implements.Delete;
import sqllib.Secrets;

public interface Deletable {

    Delete delete = new Delete();

    static void deleteTable(String query, Secrets credentials) {
        delete.deleteTable(query, credentials);
    }
}
