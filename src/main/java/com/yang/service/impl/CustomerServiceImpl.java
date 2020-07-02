package com.yang.service.impl;

import java.util.List;

import com.yang.dao.CustomerDao;
import com.yang.entity.Customer;
import com.yang.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao customerDao;
	public CustomerServiceImpl() {}
		
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void saveCustomer() {
		System.out.println("业务层调用数据层存储客户信息");
		customerDao.saveCustomer();
	}

	@Override
	public void deleteCustomer() {
		System.out.println("业务层调用数据层删除客户信息");
		customerDao.deleteCustomer();
	}

	@Override
	public void updateCustomer() {
		System.out.println("业务层调用数据层更新客户信息");
		customerDao.updateCustomer();
	}

	@Override
	public Customer selectOne(int i) {
		System.out.println("业务层调用数据层查询一个客户信息");
		return customerDao.selectOne(1);
	}

	@Override
	public List<Customer> selectAll() {
		System.out.println("业务层调用数据层查询所有客户信息");
		return customerDao.selectAll();
	}

}
