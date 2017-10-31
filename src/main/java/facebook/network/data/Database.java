package facebook.network.data;

import facebook.network.model.User;

/**
 * Created by Ярик on 31.10.2017.
 */
public class Database {

    public static User[] getUser(){
      User[] users = {new User("Alex","Smernov",35),
              new User("Bob","Smernov",40),
              new User("Alex","Smernov",15)};
        return users;
    }

}
