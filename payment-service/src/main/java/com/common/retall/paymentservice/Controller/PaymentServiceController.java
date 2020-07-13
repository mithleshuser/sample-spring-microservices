package com.common.retall.paymentservice.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping(value="/rest/payment" , method = RequestMethod.GET)
public class PaymentServiceController {

	
	@RequestMapping
	public String welcomePaymentservice(){
		return "welcome to Paymentservice page";
	}
	
	
	@RequestMapping("/client")
	public String welcomePaymentserviceClient(){
		return "welcome to Paymentservice client page";
	}
	
}