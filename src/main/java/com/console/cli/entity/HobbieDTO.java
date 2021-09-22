package com.console.cli.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@ToString
public class HobbieDTO implements Serializable {

    @Getter @Setter
    private String nameHobbie;

}
