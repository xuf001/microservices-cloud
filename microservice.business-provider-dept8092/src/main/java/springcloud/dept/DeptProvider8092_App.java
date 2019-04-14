package springcloud.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8092_App {

	public static void main(String[] args) {
		
		SpringApplication.run(DeptProvider8092_App.class, args);
	}
}
