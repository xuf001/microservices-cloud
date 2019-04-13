package springcloud.dept.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//类似spring里面的applicationContext.xml写入的注入Bean
@Configuration
public class ConfigBean {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
}
