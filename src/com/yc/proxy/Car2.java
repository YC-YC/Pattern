package com.yc.proxy;
/**
 *@Author Administrator
 *@Time 2016-4-5 ����10:38:47
 */
public class Car2 extends Car {

	/**ʹ�ü̳з�ʽ������������ʱ��*/
	@Override
	public void move() {
		
		long startTime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ...");
		
		super.move();
		
		System.out.println("����������ʻ...");
		long endTime = System.currentTimeMillis();
		System.out.println("������ʻ�� " + (endTime - startTime));
	}
}
