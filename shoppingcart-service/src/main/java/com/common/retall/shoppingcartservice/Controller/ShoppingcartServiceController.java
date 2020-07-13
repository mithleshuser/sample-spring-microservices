package com.common.retall.shoppingcartservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest/shoppingcart" , method = RequestMethod.GET)
public class ShoppingcartServiceController {


	@RequestMapping
	public String welcome(){
		return "welcome to ShoppingcartService page";
	}
	
	@RequestMapping("/client")
	public String welcomeShoppingcartServiceClient(){
		return "welcome to ShoppingcartService client page";
	}
	
}