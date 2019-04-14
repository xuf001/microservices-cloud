package springcloud.dept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import springcloud.entities.Dept;
import springcloud.service.DeptClientService;

@RestController
public class DeptController_Consumer {

/*//	private static final String REST_URL_PREFIX="http://localhost:8090";
	//标准的微服务访问地址，可以通过微服务的真是名字访问
	private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-BUSINESS-DEPT";
	
	
	//消费者调rest接口，提供平多种远程HTTP 服务访问，将rest调用又封装了一层
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/consumer/dept/add")
	public boolean add(Dept dept) {
		
		return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
	}
	
	@RequestMapping(value="/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
	}
	
	@RequestMapping(value="/consumer/dept/list")
    public List<Dept> list()
    {
         return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
    }  */
	
	@Autowired
	  private DeptClientService service = null;

	  @RequestMapping(value = "/consumer/dept/get/{id}")
	  public Dept get(@PathVariable("id") Long id)
	  {
	   return this.service.get(id);
	  }

	  @RequestMapping(value = "/consumer/dept/list")
	  public List<Dept> list()
	  {
	   return this.service.list();
	  }

	  @RequestMapping(value = "/consumer/dept/add")
	  public Object add(Dept dept)
	  {
	   return this.service.add(dept);
	  }

	
}
