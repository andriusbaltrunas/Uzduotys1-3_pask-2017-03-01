package com.kcs.car.service.vo;

import java.io.Serializable;

/**
 * Created by andriusbaltrunas on 3/2/2017.
 */
public class Client implements Serializable{
    private String name;
    private String surname;

    public Client(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
