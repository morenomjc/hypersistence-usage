package com.example.hypersistenceusage;


import io.hypersistence.optimizer.HypersistenceOptimizer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DatabasePerformanceIntegrationTest extends DatabaseIntegrationTest {

	@Autowired
	private HypersistenceOptimizer hypersistenceOptimizer;

	@Test
	void testNoDatabasePerformanceIssues() {
		assertThat(hypersistenceOptimizer.getEvents()).isEmpty();
	}
}
