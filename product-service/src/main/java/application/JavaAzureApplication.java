package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.product" })
public class JavaAzureApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaAzureApplication.class, args);
	}

}
