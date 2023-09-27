package com.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.StudentManagementSystem.entity.SmsEntity;

public interface SmsRepo extends JpaRepository <SmsEntity, Integer>{

}
