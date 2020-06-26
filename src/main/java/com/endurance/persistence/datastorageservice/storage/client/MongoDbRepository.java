package com.endurance.persistence.datastorageservice.storage.client;

public interface MongoDbRepository
{
	Document getDocument(String modelName, String id);
	boolean storeDocument(String modelName, Document document);
}
