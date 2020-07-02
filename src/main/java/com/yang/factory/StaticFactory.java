package com.yang.factory;

import com.yang.dao.CustomerDao;
import com.yang.dao.impl.CustomerDaoImpl;
import com.yang.service.CustomerService;
import com.yang.service.impl.CustomerServiceImpl;

public class StaticFactory {
	
	public static CustomerService getServiceInstance() {
		return new CustomerServiceImpl();
	}
	

}
