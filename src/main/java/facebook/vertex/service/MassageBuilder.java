package facebook.vertex.service;

import facebook.vertex.model.Users;

/**
 * Created by Ярик on 01.11.2017.
 */
public class MassageBuilder extends HappyBuilder {


    @Override
    public String build(Users users) {
        return super.build(users)+ "\n"+
                "name     = " + users.getName()+"\n"+
                "surname  = " + users.getSurname() +"\n"+
                "age      = " + users.getAge()+ "\n"+
                getClass();
    }
}
