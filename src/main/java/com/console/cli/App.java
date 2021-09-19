package com.console.cli;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterDescription;
import com.beust.jcommander.ParameterException;
import com.beust.jcommander.Parameterized;
import com.console.cli.args.Args;
import com.console.cli.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class App {

	final Args mainArgs = new Args();

	@Autowired
	private IUserService userService;

	public static void main(String[] args) {
		App main = new App();
		//Recived args  Example. java jarname.jar -d=2020-11-24
		args = new String[]{"-d=2020-11-24"};
		main.handleInputArgs(args);

	}

	void handleInputArgs(String args[]) {
		JCommander jcmd = new JCommander(mainArgs);
		//jCommander.addCommand("-date", "2020-11-24");
		try {
			jcmd.parse(args);
			if (jcmd!=null){
				List<ParameterDescription> parameters =  jcmd.getParameters();
				Map<String, ParameterDescription> paramsMap = new LinkedHashMap<>(parameters.size());
				System.out.printf("paams" + paramsMap);
			}else{
				showUsage(jcmd);
			}
			//Convert args to Date with (yyy-MM-dd)
			//userService.getReportUsers(args)
			System.out.println("Ok!" );

		} catch (ParameterException exception) {
			System.out.println(exception.getMessage());
			showUsage(jcmd);
		}


	}

	void showUsage(JCommander jCommander) {
		jCommander.usage();
		System.exit(0);
	}

	void run() {
		System.out.println("Running archive with ...");
		System.out.println(mainArgs);
	}


}
