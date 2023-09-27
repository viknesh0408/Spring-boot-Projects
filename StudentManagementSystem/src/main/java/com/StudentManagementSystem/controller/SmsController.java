package com.StudentManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.StudentManagementSystem.service.SmsService;
import com.StudentManagementSystem.entity.SmsEntity;

@Controller
public class SmsController {
	
	SmsService smsService;

	public SmsController(SmsService smsService) {
		super();
		this.smsService = smsService;
	}

	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", smsService.getAllStudents());
		return "students";
	}
	
	@GetMapping ("/students/new")
	public String createStudentForm(Model model) {
		SmsEntity student = new SmsEntity();
		model.addAttribute("student", student);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") SmsEntity student) {
		 smsService.saveStudent(student);
		 return "redirect:/students";
	}
	
}
