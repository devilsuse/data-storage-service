package com.endurance.persistence.datastorageservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.endurance.persistence.datastorageservice.model.AdminSetting;
import com.endurance.persistence.datastorageservice.service.AdminSettingService;

@RestController
public class AdminSettingController
{
	@Autowired
	private AdminSettingService adminSettingService;
	
	@PutMapping
	public ResponseEntity<?> createAdminSetting(@RequestBody AdminSetting adminSetting)
	{
		
		adminSettingService.storeAdminSetting(adminSetting);
		return null;
	}
	
}
