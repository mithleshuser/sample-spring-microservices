package com.common.retall.ordersservice.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/rest/order" , method = RequestMethod.GET)
public class OrderServiceController {

	
	@RequestMapping
	public String welcomeOrder(){
		return "welcome to Order service page";
	}
	

	@RequestMapping("/client")
	public String welcome(){
		return "welcome to Order service client page";
	}
	
	
}