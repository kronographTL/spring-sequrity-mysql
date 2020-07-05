package com.kronographtl.springsequritymysql;

import com.kronographtl.springsequritymysql.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@SpringBootApplication
public class SpringSequrityMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSequrityMysqlApplication.class, args);
	}

}
