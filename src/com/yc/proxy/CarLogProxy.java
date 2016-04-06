package com.yc.proxy;
/**
 *@Author Administrator
 *@Time 2016-4-5 ����10:43:01
 */
public class CarLogProxy implements Moveable {

	private Moveable mMoveable;
	
	public CarLogProxy(Moveable car) {
		mMoveable = car;
	}
	
	/**ʹ�þۺϷ�ʽ��������������Ϊ��Ա�������ռǴ��������*/
	@Override
	public void move() {
		
		System.out.println("������ʼ��¼�ռ�...");
		
		mMoveable.move();
		
		System.out.println("����������¼�ռ�...");
	}

}
