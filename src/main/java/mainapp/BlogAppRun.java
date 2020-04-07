package mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogAppRun {

	public static void main(String[] args) {
		SpringApplication.run(BlogAppRun.class, args);
	}
   //loads the defaults - starts spring boot app - maoin entry point with @springbootapplication, performas classpath scan.
}
