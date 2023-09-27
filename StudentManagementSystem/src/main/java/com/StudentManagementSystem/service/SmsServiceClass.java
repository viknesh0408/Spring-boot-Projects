package com.StudentManagementSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.StudentManagementSystem.entity.SmsEntity;
import com.StudentManagementSystem.repository.SmsRepo;
@Service
public class SmsServiceClass  implements SmsService{
	
	private SmsRepo smsRepo;
	

	public SmsServiceClass(com.StudentManagementSystem.repository.SmsRepo smsRepo) {
		super();
		this.smsRepo = smsRepo;
	}


	@Override
	public List<SmsEntity> getAllStudents() {
		return smsRepo.findAll();
	}


	@Override
	public SmsEntity saveStudent(SmsEntity students) {
		// TODO Auto-generated method stub
		return smsRepo.save(students);
	}

}
