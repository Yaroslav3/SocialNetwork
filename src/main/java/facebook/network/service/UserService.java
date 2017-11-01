package facebook.network.service;
import facebook.network.data.Database;
import facebook.network.model.User;
import sun.security.provider.certpath.Vertex;
import vertex.counter.VertexCounter;

import java.util.Arrays;

/**
 * Created by Ярик on 31.10.2017.
 */
public class UserService {
    public static void main(String[] args) {
        final User user = new User();
      // getAll();
      // getFirst();
      // getLast();

      //  final User userByName = g

       // todo create method getBy...(all fields);
        VertexCounter vertexCounter = new VertexCounter();
        int unicode = vertexCounter.counterUnicode("test");
        System.out.println(unicode);

    }

    private static void getLast() {
        System.out.println(" ");
        User[] users = Database.getUser();
        int i = 0;
        for (; i < users.length - 1; i++) {
        }
        System.out.println(users[i]);
    }

    private static void getFirst() {
        System.out.println(" ");
        User[] users = Database.getUser();
        System.out.println(users[0]);
    }

    private static void getAll() {
        System.out.println(" ");
        final User[] users = Database.getUser();
        for (User user : users) {
            System.out.println(user);
        }

    }
}
