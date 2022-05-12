package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Repository.MemberRepository;
import com.example.demo.domain.Member;

@Controller
@RequestMapping("/exam05")
public class Exam05Controller {
	
	@Autowired
	private MemberRepository repository;
	
	@RequestMapping("")
	public String index() {
		return "exam05";
	}
	
	@RequestMapping("/findByName")
	public String find(String name,Model model) {
		List<Member> memberlist=repository.findByName(name);
		model.addAttribute("memberlist",memberlist);
		
		return "exam05-result";
	}

}
