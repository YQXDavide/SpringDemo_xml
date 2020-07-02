package com.yang.test2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
//		Action action = (Action) Proxy.newProxyInstance(Actor.class.getClassLoader(), Actor.class.getInterfaces(),
//			new InvocationHandler() {
//				
//				@Override
//				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//					preAction();
//					Object rtValue = null;
//					String singName = (String) args[0];
//					if(method.getName().equals("sing")) {
//						rtValue = method.invoke(Actor.class.newInstance(), args);
//					}
//					if(method.getName().equals("dance")) {
//						rtValue = method.invoke(Actor.class.newInstance(), args);
//					}
//					postAction();
//					return rtValue;
//				}
//				private void preAction() {
//					System.out.println("表演前先做准备工作");
//				}
//				private void postAction() {
//					System.out.println("表演后核对价钱");
//				}
//			});
//		action.dance("拉丁");
//		action.sing("青藏高原");
		InvocationHandler handler = new ActionProxy();
		Action action = (Action) Proxy.newProxyInstance(Actor.class.getClassLoader(), 
							Actor.class.getInterfaces(),
							handler);
		action.dance("拉丁舞");
		action.sing("青藏高原");
	}
	
}
