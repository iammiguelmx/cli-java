package com.console.cli.args;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.console.cli.validator.DateValidator;
import com.console.cli.validator.PositiveInteger;
import lombok.Getter;
import lombok.Setter;

@Parameters(separators = "=")
public class Args {

    @Parameter(names = {"-d", "-date"},
            required = true,
            validateWith = DateValidator.class,
            description = "Date of process")
    @Getter @Setter
    private String date;

    @Parameter(names = {"-age", "-a"},
             validateWith = PositiveInteger.class,
             description = "Age Positive value")
    @Getter @Setter
    private Integer age;

    @Parameter(names = {"-h", "--help"},
            help = true,
            description = "Displays help information")
    @Getter @Setter
    private boolean help;


}
