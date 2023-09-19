package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class SeedDB implements CommandLineRunner{

	@Autowired
	private UserRepository userRepositoy;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown");
		User u2 = new User(null, "Alex Green"); 

		userRepositoy.saveAll(Arrays.asList(u1,u2));
	}

}
