package com.yc.proxy;
/**
 *@Author Administrator
 *@Time 2016-4-5 ����10:35:01
 */
public class Car implements Moveable {

	@Override
	public void move() {
//		long startTime = System.currentTimeMillis();
//		System.out.println("������ʼ��ʻ...");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println("����������ʻ...");
//		long endTime = System.currentTimeMillis();
//		System.out.println("������ʻ�� " + (endTime - startTime));
	}

}
