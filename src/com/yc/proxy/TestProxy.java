package com.yc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.yc.proxy.jdkproxy.TimeProxy;

/**
 *@Author Administrator
 *@Time 2016-4-5 ����10:37:59
 */
public class TestProxy {

	public static void main(String[] args) {

//		/**ʹ�ü̳з�ʽ����*/
//		Moveable m = new Car2();
//		m.move();
		
		/**ʹ�þۺϷ�ʽ��������������Ϊ��Ա������ʱ�䴦�������*/
//		Car car = new Car();
//		Moveable m = new CarTimeProxy(car);
//		m.move();
		
		/**ʹ�þۺϷ�ʽ��������չ,ֻ�ǵ���˳�򼴿ɣ����̳з�ʽ��Ҫ��������̳�*/
//		Car car = new Car();
//		CarTimeProxy ctp = new CarTimeProxy(car);
//		CarLogProxy clp = new CarLogProxy(ctp);
//		clp.move();		
		
//		Car car = new Car();
//		CarLogProxy clp = new CarLogProxy(car);
//		CarTimeProxy ctp = new CarTimeProxy(clp);
//		ctp.move();	
		
		/**��̬����
		 * 1������һ��ʵ��InvocationHandler���࣬��ʵ��invoke����
		 * 2�������������༰�ӿ�
		 * 3������Proxy������̬����һ��������
		 * 4��ͨ��������÷���
		 * */
		
		Car car = new Car();
		InvocationHandler h = new TimeProxy(car);
		
		Class<?> cls = car.getClass();
		ClassLoader loader = cls.getClassLoader();
		
		Class<?>[] interfaces = cls.getInterfaces();
		/** JDK��̬���� 
		 * loader:�������
		 * interfaces��ʵ�ֽӿ�
		 * */
		Moveable m = (Moveable) Proxy.newProxyInstance(loader, interfaces, h);
		m.move();
	}

}
