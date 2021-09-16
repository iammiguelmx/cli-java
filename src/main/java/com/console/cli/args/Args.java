package com.console.cli.args;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.console.cli.validator.DateValidator;

@Parameters(separators = "=") //space works too
public class Args {

    @Parameter(names = {"-d", "-date"},
            required = true,
            validateWith = DateValidator.class,
            description = "Date of process")
    private String date;

}
