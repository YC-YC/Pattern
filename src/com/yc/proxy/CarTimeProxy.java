package com.yc.proxy;
/**
 *@Author Administrator
 *@Time 2016-4-5 ����10:43:01
 */
public class CarTimeProxy implements Moveable {

	private Moveable mMoveable;
	
	public CarTimeProxy(Moveable car) {
		mMoveable = car;
	}
	
	/**ʹ�þۺϷ�ʽ��������������Ϊ��Ա������ʱ�䴦�������*/
	@Override
	public void move() {
		
		long startTime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ...");
		
		mMoveable.move();
		
		System.out.println("����������ʻ...");
		long endTime = System.currentTimeMillis();
		System.out.println("������ʻ�� " + (endTime - startTime));
	}

}
