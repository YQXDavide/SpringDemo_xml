package com.yang.test2;

public class Actor implements Action{

	@Override
	public void dance(String danceName) {
		System.out.println("跳："+danceName);
		
	}

	@Override
	public void sing(String singName) {
		System.out.println("唱："+singName);
		
	}

}
