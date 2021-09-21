package com.console.cli;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;
import com.console.cli.args.Args;
import java.util.List;

//Main principal
public class App {


	public static void main(String[] args) {
		//Args to read.
		args = new String[]{"-d=2020-11-24","-user=study,read,sleep"};

		//Define args
		Args arguments = new Args();
		JCommander jcommander = JCommander.newBuilder().addObject(arguments).build();

		try {
			//Parse args
			jcommander.parse(args);

			//Get values from args.
			List<Object> objects = jcommander.getObjects();


			for (Object object : objects) {
				if (object instanceof Args){
					Object fieldValue = ((Args) object).getDate();
					Object secondValue = ((Args) object).getHobbieDTOList();
					System.out.println("Args position 1: " +  (String) fieldValue);
					System.out.println("Args position 2: " + (List) secondValue);
				}
			}
		} catch (ParameterException e) {
			//Show how usage
			jcommander.usage();
		}
	}


}
