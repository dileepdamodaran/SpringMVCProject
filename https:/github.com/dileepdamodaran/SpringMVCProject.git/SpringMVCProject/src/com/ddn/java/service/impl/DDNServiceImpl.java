package com.ddn.java.service.impl;

import org.springframework.stereotype.Service;

import com.ddn.java.service.DDNService;

@Service("ddnService")
public class DDNServiceImpl implements DDNService {

	@Override
	public void testService() {
		// TODO Auto-generated method stub
		System.out.println("testing autowiring");
	}

	
}
