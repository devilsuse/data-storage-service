package com.endurance.persistence.datastorageservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
	@Bean
	public MongoClient getClient()
	{
		return new MongoClient();
	}
	
	private static class MongoClient 
	{
		
	}
}
