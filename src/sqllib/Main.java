package sqllib;

import sqllib.Implements.Create;
import sqllib.Interfaces.Creatable;
import sqllib.Interfaces.Deletable;
import sqllib.Interfaces.Readable;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Secrets secrets = new Secrets();

        secrets.setUrl("jdbc:postgresql://localhost/test");
        secrets.setUsername("apinan");
        secrets.setPassword("admin");

        String[] columnsLabels = {"first_name", "last_name", "username", "friends", "companies"};
        Readable.readDB("users", columnsLabels);
    }

}
