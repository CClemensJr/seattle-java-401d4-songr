package com.super_famicom_coder.songr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@EnableAutoConfiguration
@SpringBootApplication
public class SongrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongrApplication.class, args);
	}

	// Inspired by https://dzone.com/articles/how-to-create-a-database-seeder-in-spring-boot
	@EventListener
	public void seedDB(ContextRefreshedEvent event) {
		seedAlbums();
		seedSongs();
	}

	private void seedAlbums() {

	}

	private void seedSongs() {

	}

}
