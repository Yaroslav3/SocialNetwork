package facebook.network.model;

import facebook.network.service.UserService;

/**
 * Created by Ярик on 31.10.2017.
 */
public class User {
    private String name;
    private String surname;
    private int age;
    private String hobby;

     public User(){

    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "name     = " + name + "\n" +
                "surname = " + surname + "\n" +
                "age     = " + age ;
    }

}
