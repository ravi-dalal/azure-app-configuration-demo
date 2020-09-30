package io.demo.service;
/*
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.demo.cosmosdb.dto.DemoContainer;
import io.demo.cosmosdb.repository.DemoRepository;

@Service
public class AppService {
	
	Logger logger = LoggerFactory.getLogger(AppService.class);
	
	@Autowired
	private DemoRepository demoRepository;
	
	public String getMessageFromCosmosDb () {
		logger.info("In getMessageFromCosmosDb() method");
		Iterable<DemoContainer> demoContainer = demoRepository.findAll();
		String message = "";
		for (DemoContainer document : demoContainer) {
			message += document.getValue() + " ";
		}
		return message;
	}
	
}
*/