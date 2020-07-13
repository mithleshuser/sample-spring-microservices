package com.common.retall.productservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;




@RestController
@RequestMapping(value="/rest/product" , method = RequestMethod.GET)
public class ProductServiceController {

	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private LoadBalancerClient loadBalancerClient;  //SHOPPINGCART-SERVICE 
	
	
	@RequestMapping("/client")
	public String welcomeProductservice(){
		return "welcome to productservice page";
	}
	

	@HystrixCommand(fallbackMethod = "myfallbackMethod" )
	@RequestMapping
	public String welcome(){
		
		String url = "http://SHOPPINGCART-SERVICE/rest/shoppingcart/";
		
		ServiceInstance serviceInstance = loadBalancerClient.choose("SHOPPINGCART-SERVICE ");
		System.out.println("Which port is it connecting to" +"   :   "+serviceInstance.getUri());

		return restTemplate.getForObject(url, String.class);
	}

	public String myfallbackMethod() {
		// TODO Auto-generated method stub
		return "We are investigating issues with <SHOPPINGCART> and will provide updates here soon. SHOPPINGCART-SERVICE may me down...!  ";
	}
	
	
}