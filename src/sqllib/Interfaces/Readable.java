package sqllib.Interfaces;

import sqllib.Implements.Read;
import java.util.LinkedList;

public interface Readable {

    Read read = new Read();

    static LinkedList<String[]> readDB(String tableName, String[] columnLabels) {
        return read.readDB(tableName, columnLabels);
    }
}
