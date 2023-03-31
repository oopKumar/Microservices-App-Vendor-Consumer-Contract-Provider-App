package com.oop.consumer;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ContractConsumer {
	
	private DiscoveryClient dicoveryClient;

	public ContractConsumer(DiscoveryClient dicoveryClient) {
		super();
		this.dicoveryClient = dicoveryClient;
	}
	
	public String callContractGetData() {
		List<ServiceInstance> list = dicoveryClient.getInstances("CONTRACT-SERVICE");
		ServiceInstance si = list.get(0);
		String url = si.getUri()+"/contract/data";
		RestTemplate template = new RestTemplate();
		String resp = template.getForObject(url,String.class);
	
		return resp;
	}

}
