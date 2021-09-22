package com.console.cli;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;
import com.console.cli.args.Args;
import com.console.cli.entity.HobbieDTO;
import com.console.cli.service.IHobbieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//Main principal
public class App {

	@Autowired
	private static IHobbieService iHobbieService;

	public App(IHobbieService iHobbieService) {
		this.iHobbieService = iHobbieService;
	}

	public static void main(String[] args) {
		App app = new App(iHobbieService);

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

			//TODO: Make Generic
			for (Object object : objects) {
				if (object instanceof Args){
					Object fieldValue = ((Args) object).getDate();
					List<HobbieDTO> secondValue =  ((Args) object).getHobbieDTOList();
					//Register service
					System.out.println(secondValue.size());
					try {
						int register = iHobbieService.register(secondValue);
					}catch (Exception e){
						System.out.println(e.getMessage());
					}

				}
			}
		} catch (ParameterException e) {
			//Show how usage
			jcommander.usage();
		}
	}


}
