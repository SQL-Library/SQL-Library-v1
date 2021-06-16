package com.apinanyogaratnam;

public interface Creatable {

    Create create = new Create();

    static void createNewTable(String query) {
        create.createNewTable(query);
    }

}
