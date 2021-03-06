package com.example.springtobi.bean;

public class User
{

    private String login;
    private String password;
    private UserData userData;

    public User()
    {
        this.userData =  new UserData();
    }

    public User(String login, String password)
    {
        this.login = login;
        this.password = password;
    }



    public boolean isAdmin()
    {

        return this.password.equals("admin") && this.login.equals("admin");

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

    public UserData getUserData()
    {
        return userData;
    }

    public void setUserData(UserData userData)
    {
        this.userData = userData;
    }

}
