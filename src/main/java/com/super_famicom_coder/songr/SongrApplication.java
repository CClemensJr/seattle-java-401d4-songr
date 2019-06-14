package com.super_famicom_coder.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@EnableAutoConfiguration
@SpringBootApplication
public class SongrApplication {
	@Autowired
	AlbumRepository albumRepository;

	@Autowired
	SongRepository songRepository;

	public static void main(String[] args) {
		SpringApplication.run(SongrApplication.class, args);
	}

	// Inspired by https://dzone.com/articles/how-to-create-a-database-seeder-in-spring-boot
	@EventListener
	public void seedDB(ContextRefreshedEvent event) {
		seedTables();
	}

	private void seedTables() {
		Album album1 = new Album("Flamagra", "Flying Lotus", 27, 4017, "https://d1rgjmn2wmqeif.cloudfront.net/r/g/129297-1.jpg");
		Album album2 = new Album("Hurts 2B Human", "P!nk", 13, 2823, "https://upload.wikimedia.org/wikipedia/en/1/17/Pink_-_Hurts_2B_Human.png");
		Album album3 = new Album("Here Comes the Cowboy", "Mac DeMarco", 13, 2792, "https://upload.wikimedia.org/wikipedia/en/4/47/Mac-DeMarco-Here-Comes-The-Cowboy-00842812112638-e1557039292481.png");
		Album album4 = new Album("Father of Asahd", "DJ Khaled", 15, 3624, "https://upload.wikimedia.org/wikipedia/en/f/fa/DJ_Khaled_-_Father_of_Asahd.png");
		Album album5 = new Album("The Coffin Train", "Diamond Head", 10, 3215, "https://www.emp-online.com/dw/image/v2/BBQV_PRD/on/demandware.static/-/Sites-master-emp/default/dw2e3125f6/images/4/4/1/5/441504.jpg?sw=350&sh=400&sm=fit&sfrm=png");

		albumRepository.save(album1);
		albumRepository.save(album2);
		albumRepository.save(album3);
		albumRepository.save(album4);
		albumRepository.save(album5);

		Song song1 = new Song(album1.getTitle(), "");
	}
}
