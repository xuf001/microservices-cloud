package springcloud.dept.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

//类似spring里面的applicationContext.xml写入的注入Bean
@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public IRule myRule() {
		return new RandomRule();//达到目的，用我们选择的随机算法替代默认轮训
	}
}
