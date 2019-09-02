package com.ddn.java.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ddn.java.bean.Person;
import com.ddn.java.service.DDNService;


@Controller
public class DDNController implements ApplicationContextAware {
	
	@Autowired(required = true)
	private DDNService ddnService;
	private ApplicationContext applicationContext;
	


	@RequestMapping(value="/loadPage")
	//@RequestMapping(value="/loadPage", method =RequestMethod.GET, produces="application/json")
	//@ResponseBody
	public String loadDDNFirstPage(Model model) {
		Person p =new Person();
		p.setFirstName("Dileep");
		p.setLastName("Damodaran");
		p.setTitle("Dr.");
		model.addAttribute("person", p);
		ddnService.testService();
		return "ddnFirstPage";
	}




	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext =arg0;
	}




	
	//@Qualifier(value ="ddnService")
	/*public void setDdnService(DDNService ddnService) {
		this.ddnService = ddnService;
	}*/




	
	
	
}
