package com.console.cli.validator;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class DateValidator implements IParameterValidator {

    @Override
    public void validate(String name, String value) throws ParameterException {
       if (name.isEmpty()){
           throw new ParameterException("Parameter " + name + " should be requiered (found " + value +")");
       }

    }
}
