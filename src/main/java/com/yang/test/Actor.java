package com.yang.test;

public class Actor implements Show{

	@Override
	public void dance(String danceName) {
		System.out.println("跳："+danceName);
		
	}

	@Override
	public void sing(String singName) {
		System.out.println("唱："+singName);
		
	}

}
