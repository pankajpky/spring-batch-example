package com.techie.springbatchexample.batch;

import java.util.List;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;

import com.techie.springbatchexample.model.User;
import com.techie.springbatchexample.repository.UserRepository;

public class DBWriter implements ItemWriter<User> {
	@Autowired
	private UserRepository userRepository;

	@Override
	public void write(Chunk<? extends User> user) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("data saved for user : " + user.toString());
		userRepository.saveAll(user);
	}

}
