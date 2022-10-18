package io.dbdiff.dbdiffanalyser;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MySQLContainer;

@SpringBootTest
@ActiveProfiles("MySql")
@Log
class MySqlDbDiffAnalyserApplicationTest {

	static MySQLContainer<?> sourceDatasource = new MySQLContainer<>("mysql:8");
	static MySQLContainer<?> destinationDatasource = new MySQLContainer<>("mysql:8");

	static {
		sourceDatasource.start();
		destinationDatasource.start();
	}

	@DynamicPropertySource
	static void registerSourceDatasourceProperties(DynamicPropertyRegistry registry) {
		registry.add("spring.datasource.source.url", sourceDatasource::getJdbcUrl);
		registry.add("spring.datasource.source.username", sourceDatasource::getUsername);
		registry.add("spring.datasource.source.password", sourceDatasource::getPassword);
	}

	@DynamicPropertySource
	static void registerDestinationDatasourceProperties(DynamicPropertyRegistry registry) {
		registry.add("spring.datasource.destination.url", destinationDatasource::getJdbcUrl);
		registry.add("spring.datasource.destination.username", destinationDatasource::getUsername);
		registry.add("spring.datasource.destination.password", destinationDatasource::getPassword);
	}

	@Test
	void contextLoads() {
		log.info("contextLoads");
	}

}
