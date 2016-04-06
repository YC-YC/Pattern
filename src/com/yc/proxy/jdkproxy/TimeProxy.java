package com.yc.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.yc.proxy.Car;
import com.yc.proxy.Moveable;

/**
 *@Author Administrator
 *@Time 2016-4-5 ����11:02:49
 *
 *jdk�ṩ�Ķ�̬���ط���
 *
 */
public class TimeProxy implements InvocationHandler {

	private Object target;
	
	public TimeProxy(Moveable car) {
		target = car;
	}

	/**
	 * proxy �����������
	 * method �����������ķ���
	 * args �������Ĳ���
	 * 
	 * @return �����ķ���ֵ
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		long startTime = System.currentTimeMillis();
		System.out.println("ʱ�����...");
		
		method.invoke(target);
		
		long endTime = System.currentTimeMillis();
		System.out.println("ʱ�������㻨���� " + (endTime - startTime));
		
		
		return null;
	}

}
