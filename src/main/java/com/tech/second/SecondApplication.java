package com.tech.second;

import com.tech.second.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondApplication {

	public static void main(String[] args) {

		SpringApplication.run(SecondApplication.class, args);
		User user=new User();
		user.setAge(12);
		user.setName("Vishal");
		user.setId(1);
		System.out.println("All Record="+user.toString());
		System.out.println("name="+user.getName());
		System.out.println("name="+user.getId());
		System.out.println("name="+user.getAge());
		User user1=new User(10,"Vaishnavi",2);
		System.out.println("All Record="+user1.toString());
		System.out.println("name="+user1.getName());
		System.out.println("name="+user1.getId());
		System.out.println("name="+user1.getAge());

	}

}
