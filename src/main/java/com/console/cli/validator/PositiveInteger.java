package com.console.cli.validator;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PositiveInteger implements IParameterValidator {

    @Override
    public void validate(String name, String value) throws ParameterException {
        log.info("Validate PositiveInteger.");
        if (name.isEmpty()){
            log.error("Error: El nombre del paramatro esta vacio" );
            throw new ParameterException("Parameter " + name + " should be requiered (found " + value +")");
        }
    }

}
