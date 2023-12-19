package com.sd.studentapi.config;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sd.studentapi.model.Student;
import com.sd.studentapi.repository.StudentRepository;

@Configuration
public class StudentConfig {

	private static final Month SEPTEMBER = null;

	// add a bean
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student sd = new Student("sumit","sumitdakua4@gamil.com",LocalDate.of(1996,Month.JULY,12));
			Student rd = new Student("roy","roy@gamil.com",LocalDate.of(1997,Month.SEPTEMBER,11));

			// invoke repository and save data to db
		repository.saveAll(List.of(sd,rd));
		};
	}

}
