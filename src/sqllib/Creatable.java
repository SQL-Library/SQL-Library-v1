package sqllib;

public interface Creatable {

    Create create = new Create();

    static void createNewTable(String query) {
        create.createNewTable(query);
    }

}
