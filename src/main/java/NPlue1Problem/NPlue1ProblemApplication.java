package NPlue1Problem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

// N + 1 Problem in Hibernate

@SpringBootApplication
@EnableCaching
public class NPlue1ProblemApplication {

	public static void main(String[] args) {
		SpringApplication.run(NPlue1ProblemApplication.class, args);
	}

}
