package com.example;

import com.example.domain.User;
import com.example.repository.UserRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Resource
	private UserRepository userRepository;

	@Test
	public void contextLoads() {
	}


	@Test
	public void test_findAll(){
		userRepository.save(new User(1,"15626139116","15626139118"));
		userRepository.save(new User(2,"15626139117","15626139118"));
		userRepository.save(new User(3,"15626139118","15626139118"));
		List<User> result = userRepository.findAll();
		result.forEach(e-> System.out.println(e.getPhone()));

		User test = userRepository.findByPhone("15626139116");
		System.out.println(test.getPassword());
	}
}
