package com.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories(value = "com.dao")
public class MongoConfiguration extends AbstractMongoConfiguration {

	

	@Override
	protected String getDatabaseName() {
		return "testDb";
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		return new MongoClient();
	}

	

}
