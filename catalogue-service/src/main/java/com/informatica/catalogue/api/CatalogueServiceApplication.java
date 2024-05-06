package com.informatica.catalogue.api;

import com.informatica.catalogue.api.model.Lesson;
import com.informatica.catalogue.api.repository.LessonRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories
@EnableDiscoveryClient
public class CatalogueServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(CatalogueServiceApplication.class, args);


	}


}
