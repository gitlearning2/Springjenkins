package io.mostafa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringjenkinsApplicationTests {

private static final Logger log = LoggerFactory.getLogger(SpringjenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("test case execting");
		assertEquals(true,true);
	}

}
