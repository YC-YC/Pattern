package com.yc.chain.handle;
/**
 *@Author Administrator
 *@Time 2016-3-31 ����11:15:08
 *
 *�����������Ϊ�˸�����OO���ģʽ����������RequestHandle�п��Դ���Ķ����ƿ������������ദ����ҵ��
 *
 */
public class RequestHandleFactory {

	/**�����෽��*/
	public static RequestHandle createHandle() {
		RequestHandle sales = new Sales();
		RequestHandle leader = new Leader();
		RequestHandle manager = new Manager();
		RequestHandle ceo = new CEO();
		
		/**����������*/
		sales.setSuccessor(leader);
		leader.setSuccessor(manager);
		manager.setSuccessor(ceo);
		
		return sales;
	}

}
