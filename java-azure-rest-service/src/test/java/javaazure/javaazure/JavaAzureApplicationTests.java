package javaazure.javaazure;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import application.JavaAzureApplication;
 
@SpringBootTest( classes = JavaAzureApplication.class)
class JavaAzureApplicationTests {

	@Test
	void contextLoads() {
		int a =1;
		int b = 2;
		assertTrue(a+1==b);
	}

}
