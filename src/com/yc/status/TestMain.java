package com.yc.status;
/**
 *@Author Administrator
 *@Time 2016-4-14 ����12:48:58
 *״̬ģʽ��
 *���壺����������ڲ�״̬�ı�ʱ�ı�������Ϊ���������������޸��������ࡣ
 */
public class TestMain {

	/**
	 * ����һ���Զ��ۻ��������ݲ�ͬ��״ִ̬�в�ͬ�Ĳ���
	 * 
	 * 2�������н�����
	 */
	public static void main(String[] args) {

		Machine machine = new Machine(10);
		
		machine.insertMoney();
		machine.backMoney();
		
		System.out.println("��Ҫ�н�");
		machine.insertMoney();
		machine.turnCrank();
		machine.insertMoney();
		machine.turnCrank();
		machine.insertMoney();
		machine.turnCrank();
		machine.insertMoney();
		machine.turnCrank();
		machine.insertMoney();
		machine.turnCrank();
		machine.insertMoney();
		machine.turnCrank();
		machine.insertMoney();
		machine.turnCrank();
		
		System.out.println("ѹ������------");
		
		machine.insertMoney();  
        machine.insertMoney();  
        machine.turnCrank();  
        machine.turnCrank();  
        machine.backMoney();  
        machine.turnCrank();
		
	}

}
