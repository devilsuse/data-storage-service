package com.endurance.persistence.datastorageservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endurance.persistence.datastorageservice.model.AdminSetting;
import com.endurance.persistence.datastorageservice.storage.client.MongoDbRepository;

@Service
public class AdminSettingServiceImpl implements AdminSettingService
{
	@Autowired
	private MongoDbRepository mongoDbClient;
	
	@Override
	public AdminSetting getAdminSetting(String id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean storeAdminSetting(AdminSetting adminSetting)
	{
		// TODO Auto-generated method stub
		return false;
	}
}
