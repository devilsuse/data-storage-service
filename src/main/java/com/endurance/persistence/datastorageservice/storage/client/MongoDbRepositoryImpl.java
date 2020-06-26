package com.endurance.persistence.datastorageservice.storage.client;

import org.springframework.stereotype.Repository;

@Repository
public class MongoDbRepositoryImpl implements MongoDbRepository
{
	@Override
	public Document getDocument(String modelName, String id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean storeDocument(String modelName, Document document)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
