package map_and_flatmap;

import java.util.List;

public class User {

    int id ;
    String name ;
    List<String> emails;

    public User(int id, String name, List<String> emails) {
        this.id = id;
        this.name = name;
        this.emails = emails;
    }
}
