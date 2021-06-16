package sqllib;

public interface Deletable {

    Delete delete = new Delete();

    static void deleteTable(String query) {
        delete.deleteTable(query);
    }

}
