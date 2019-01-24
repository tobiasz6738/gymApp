package com.example.springtobi.bean;

public class User {

    private String login;
    private String password;

    public User()
    {

    }

    public User(String login, String password)
    {
        this.login = login;
        this.password = password;

    }

    public boolean isAdult()
    {

        return password.equals("admin") && login.equals("admin");

    }



    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
