package ro.ubb.istudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "ro.ubb.istudent.repository")
public class IStudentApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name","application");
		SpringApplication.run(IStudentApplication.class, args);
	}
}
