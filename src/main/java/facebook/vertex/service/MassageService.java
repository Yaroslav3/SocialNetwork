package facebook.vertex.service;
import facebook.vertex.model.Users;

/**
 * Created by Ярик on 01.11.2017.
 */
public class MassageService {
    public static void main(String[] args) {
       Users users = new Users("Yaroslav","Klimashevskiy",34);
        HappyBuilder happyBuilder = new MassageBuilder();
        System.out.println(happyBuilder.build(users));


    }
}
