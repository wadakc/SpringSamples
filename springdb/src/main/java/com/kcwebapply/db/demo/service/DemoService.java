package com.kcwebapply.db.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kcwebapply.db.demo.domain.DemoManagerInterface;
import com.kcwebapply.db.demo.domain.DemoTable;

@RestController
//@EnableJpaRepositories("com.example.demo.domain")
@RequestMapping()

public class DemoService {
	@Autowired
	DemoManagerInterface demoManager;


	@RequestMapping("/getAllList")
	public List<DemoTable> getAllList() throws Exception{
		List<DemoTable> dtList = demoManager.getDemoData();
		dtList.stream().forEach(demoTable->{
			System.out.println("Tableね"+demoTable.getName()+"Tableだよ"+demoTable.getValue());
		});
		return dtList;
	}
}
