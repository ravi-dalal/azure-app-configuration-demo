package io.demo.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.demo.configuration.MessageProperties;
//import io.demo.service.AppService;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
	
	@Autowired
	MessageProperties properties;
	@Autowired
	RedisProperties redisProperties;
	//@Autowired
	//AppService service;
	
	Logger logger = LoggerFactory.getLogger(Controller.class);
	
	@GetMapping(path="/message")
	public ResponseEntity<Map> getMessage () throws JsonMappingException, JsonProcessingException {
		logger.info("In getMessage method");
		return ResponseEntity.ok(properties.getMessageMap());
	}
	
	@GetMapping(path="/redis")
	public ResponseEntity<String> getRedisHost () {
		logger.info("In getRedisHost method");
		return ResponseEntity.ok(redisProperties.getHost());
	}
/*
	@GetMapping(path="/cosmosmessage")
	public ResponseEntity<String> getCosmosDbMessage () {
		logger.info("In getCosmosDbMessage method");
		return ResponseEntity.ok(service.getMessageFromCosmosDb());
	}
*/
}
