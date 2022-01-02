package com.console.cli;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;
import com.console.cli.args.Args;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class App {

	final Args mainArgs = new Args();

	public static void main(String[] args) {
		App main = new App();
		//Args to read. (Example)
		args = new String[]{"-date=2020-11-24", "-age=23"};
		main.handleInputArgs(args);
	}

	void handleInputArgs(String args[]) {
		JCommander jCommander = new JCommander(mainArgs);
		try {
			log.info("Parse args: " + args.toString());
			jCommander.parse(args);
			makeProcess();
		} catch (ParameterException exception) {
			log.error("Error: " + exception.getMessage() );
			showUsage(jCommander);
		}
	}

	void showUsage(JCommander jCommander) {
		log.info("Show info");
		jCommander.usage();
		System.exit(0);
	}

	void makeProcess(){
		log.info(mainArgs.getAge());
		log.info(mainArgs.getDate());
		log.info(mainArgs.isHelp());
	}

}
