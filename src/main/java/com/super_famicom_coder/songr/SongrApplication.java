package com.super_famicom_coder.songr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class SongrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongrApplication.class, args);
	}

}
