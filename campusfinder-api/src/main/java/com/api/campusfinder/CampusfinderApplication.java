package com.api.campusfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CampusfinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampusfinderApplication.class, args);

		System.out.println(AnsiOutput.toString(AnsiColor.GREEN, "ONLINE!"));
	}

}
