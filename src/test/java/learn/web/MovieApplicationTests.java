package learn.web;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MovieApplicationTests {

	@BeforeAll
    static void loadEnv() {
       EnvLoader.loadEnv();
    }

	@Test
	void contextLoads() {
	}

}
