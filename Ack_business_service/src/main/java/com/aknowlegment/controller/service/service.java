package com.aknowlegment.controller.service;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.elementsoftech.core.entity.OrderHeader;

@Service
public class service {
	private Environment env;
	RestTemplate restTemp = new RestTemplate();
   public OrderHeader saveOrder(@RequestBody OrderHeader order) {
	   String coreRoot = env.getProperty("api.core.root");
	   String url=coreRoot+"/saveOrder";
	   HttpHeaders httpHeader = new HttpHeaders();
	   httpHeader.setContentType(MediaType.APPLICATION_JSON);
	   HttpEntity<OrderHeader>httpEntity = new HttpEntity<>(order,httpHeader);
		ResponseEntity<OrderHeader> response = restTemp.exchange(url, HttpMethod.POST,httpEntity,OrderHeader.class);
		return response.getBody();
	
	   
   }
}
