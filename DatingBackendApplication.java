package io.sonalibrains.dating_backend;

import io.sonalibrains.dating_backend.conversations.ChatMessages;
import io.sonalibrains.dating_backend.conversations.Conversation;
import io.sonalibrains.dating_backend.conversations.ConversationRepository;
import io.sonalibrains.dating_backend.profiles.Gender;
import io.sonalibrains.dating_backend.profiles.Profile;
import io.sonalibrains.dating_backend.profiles.ProfileCreationService;
import io.sonalibrains.dating_backend.profiles.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class DatingBackendApplication implements CommandLineRunner {

	/*@Autowired
	private ProfileRepository profileRepository;

	@Autowired
	private ConversationRepository conversationRepository;*/

	@Autowired
	private ProfileCreationService profileCreationService;

	public static void main(String[] args) {
		SpringApplication.run(DatingBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		profileCreationService.saveFilestoDB();
	}
	/*	profileRepository.deleteAll();
		conversationRepository.deleteAll();
		Profile profile = new Profile("1","Niket","Mahajan",34,"Asian","good Boy",
				Gender.MALE,"mahajan.jpg","OCD");
		profileRepository.save(profile);
		Profile profile2 = new Profile("2","Sonali","Gupta",32,"Asian","good Boy",
				Gender.FEMALE,"mahajan.jpg","OCD");
		profileRepository.save(profile2);
		profileRepository.findAll().forEach(System.out::println);

		Conversation conversation = new Conversation("1",profile.id(), List.of(new ChatMessages("Hello",
				profile.id(), LocalDateTime.now())));
		conversationRepository.save(conversation);
		conversationRepository.findAll().forEach(System.out::println);

	}*/
}
