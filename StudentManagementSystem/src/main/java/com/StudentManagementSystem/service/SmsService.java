package com.StudentManagementSystem.service;

import java.util.List;

import com.StudentManagementSystem.entity.SmsEntity;

public interface SmsService {
	List<SmsEntity> getAllStudents();
	
	SmsEntity saveStudent(SmsEntity students);
}
