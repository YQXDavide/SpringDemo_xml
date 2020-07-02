package com.yang.test;

public class Agent implements Show {
	private Actor actor;
	public Agent() {}
	
	private void preAction() {
		System.out.println("跳舞和唱歌前先谈好价格");
	}
	private void postAction() {
		System.out.println("唱歌和跳舞后收表演费");
	}
	@Override
	public void dance(String danceName) {
		preAction();
		if(actor==null) {
			actor = new Actor();
		}
		actor.dance(danceName);
		postAction();
	}

	@Override
	public void sing(String singName) {
		preAction();
		if(actor==null) {
			actor = new Actor();
		}
		actor.sing(singName);
		postAction();
	}

}
