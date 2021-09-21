package com.console.cli.args;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.console.cli.entity.HobbieDTO;
import com.console.cli.validator.DateValidator;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Parameters(separators = "=") //space works too
public class Args {

    @Parameter(names = {"-d", "-date"},
            required = true,
            validateWith = DateValidator.class,
            description = "Date of process")
    @Getter @Setter
    private String date;

    @Parameter(names = {"-u", "-user"},
            description = "User to register")
    @Getter @Setter
    private List<HobbieDTO> hobbieDTOList = new ArrayList<>();

}
