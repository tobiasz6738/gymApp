package com.example.springtobi.bean.userPackage;
 /*
 in hear We need Constructor because sometimes
 We need use force by someone give us accurate information
  */
public class PersonalData {

    private String name;
    private String surname;
    private int age;

    public PersonalData()
    {

    }

    public PersonalData(String name,String surname,int age)
    {
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

}