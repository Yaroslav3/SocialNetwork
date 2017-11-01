package facebook.vertex.service;

import facebook.vertex.model.Users;

/**
 * Created by Ярик on 01.11.2017.
 */
public class RecoverBuilder extends HappyBuilder{

    @Override
    public String build(Users users) {
        return super.build(users)+
                "name     = " + users.getName()+"\n"+
                "surname  = " + users.getSurname() +"\n"+
                "age      = " + users.getAge()+ "\n"+
                getClass();
    }
}
