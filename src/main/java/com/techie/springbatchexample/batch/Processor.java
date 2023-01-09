package com.techie.springbatchexample.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.adapter.ItemProcessorAdapter;
import org.springframework.stereotype.Component;

import com.techie.springbatchexample.model.User;

@Component
public class Processor extends ItemProcessorAdapter<User, User> {
	private static final Map<String, String> dept_names = new HashMap<>();

	public Processor() {
		dept_names.put("001", "Technology");
		dept_names.put("002", "Operations");
		dept_names.put("003", "Accounts");
	}

	@Override
	public User process(User user) throws Exception {
		String deptcode = user.getDep();
		String dept = dept_names.get(deptcode);
		user.setDep(dept);
		return user;
	}
}
