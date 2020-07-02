package com.yang.test2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ActionProxy implements InvocationHandler{
	private void preAction() {
		System.out.println("表演前先准备");
	}
	private void postAction() {
		System.out.println("表演后核对金额");
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		preAction();
		Object rtValue = null;
		if(method.getName().equals("sing")) {
			rtValue = method.invoke(Actor.class.newInstance(), args);
		}
		if(method.getName().equals("dance")) {
			rtValue = method.invoke(Actor.class.newInstance(),args);
		}
		postAction();
		return rtValue;
	}

}
