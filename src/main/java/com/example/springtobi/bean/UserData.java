package com.example.springtobi.bean;

public class UserData
{

    private String name;
    private String surname;
    private int age;
    private int weight;
    private int high;

    public UserData()
    {

    }

    public UserData(String name, String surname, int age, int weight, int high)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.high = high;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public int getHigh()
    {
        return high;
    }

    public void setHigh(int high)
    {
        this.high = high;
    }
}
