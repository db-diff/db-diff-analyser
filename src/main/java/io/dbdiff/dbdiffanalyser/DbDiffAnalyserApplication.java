package io.dbdiff.dbdiffanalyser;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class DbDiffAnalyserApplication implements CommandLineRunner {

	public static void main(String[] args) {
		log.info("Starting the application.");

		SpringApplication.run(DbDiffAnalyserApplication.class, args);

		log.info("Application finished.");
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("EXECUTING : command line runner");

		for (int i = 0; i < args.length; ++i) {
			log.info("args[" + i + "]: " + args[i]);
		}
	}
}
