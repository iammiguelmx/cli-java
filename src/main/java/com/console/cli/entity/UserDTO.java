package com.console.cli.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UserDTO implements Serializable {

    @Getter @Setter
    private String username;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private int year;
    @Getter @Setter
    private Date birth;
    @Getter @Setter
    private List<HobbieDTO> hobbieList;

}
