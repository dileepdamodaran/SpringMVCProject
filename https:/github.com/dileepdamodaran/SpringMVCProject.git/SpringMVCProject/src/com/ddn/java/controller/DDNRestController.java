package com.ddn.java.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ddn.java.bean.Person;

@RestController
public class DDNRestController {

	@RequestMapping(value="/fetchPerson", produces="application/json")
	//@ResponseBody
	public String loadDDNFirstPage(Model model) {
		/*List persons =new ArrayList();
		Person p =new Person();
		p.setFirstName("Dileep");
		p.setLastName("Damodaran");
		p.setTitle("Dr.");
		model.addAttribute("person", p);
		persons.add(p);*/
		return "testing";
	}
}
