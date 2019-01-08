package com.example.springtobi.bean;

import com.example.springtobi.bean.userPackage.PersonalData;
import com.example.springtobi.bean.userPackage.SecurityData;

import java.util.ArrayList;
import java.util.List;

public class User {

    private List<PersonalData> personalData;
    private SecurityData securityData;


    public User()
    {
        this.personalData = new ArrayList<>();
        this.securityData = new SecurityData();
    }

    public SecurityData getSecurityData() {
        return securityData;
    }

    public void setSecurityData(SecurityData securityData) {
        this.securityData = securityData;
    }

    public List<PersonalData> getPersonalData() {
        return personalData;
    }

    public void setPersonalData(List<PersonalData> personalData) {
        this.personalData = personalData;
    }
}
