package com.endurance.persistence.datastorageservice.service;

import com.endurance.persistence.datastorageservice.model.AdminSetting;

public interface AdminSettingService
{
	AdminSetting getAdminSetting(String id);
	boolean storeAdminSetting(AdminSetting adminSetting);
}
