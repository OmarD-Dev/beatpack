package com.pluralsight.beatpack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeatpackApplication implements CommandLineRunner {

	@Autowired @Qualifier("fire")
	BeatDAOImpl beat;

	public static void main(String[] args) {
		SpringApplication.run(BeatpackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	 Beat b= beat.getBeat();
		System.out.println(b.toString());
	}
}
