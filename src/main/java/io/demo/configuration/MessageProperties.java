package io.demo.configuration;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@ConfigurationProperties(prefix = "config")
public class MessageProperties {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public Map<String, Boolean> getMessageMap() throws JsonMappingException, JsonProcessingException {
    	if (this.message != null) {
    		ObjectMapper mapper = new ObjectMapper();
    		return mapper.readValue(this.message, Map.class);
    	}
    	return null;
    }
}