package ru.lesson.models;

public class User {
    private final int id;
    private final String login;
    private final String email;


    public User(int id, String login, String email) {
        this.id = id;
        this.login = login;
        this.email = email;
    }

    public int getId(){
        return id;
    }


    public String getLogin(){
        return this.login;
    }

    public String getEmail(){
        return this.email;
    }
}
