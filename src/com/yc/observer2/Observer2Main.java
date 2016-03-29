package com.yc.observer2;
/**
 *@Author Administrator
 *@Time 2016-3-30 ����1:06:06
 *�۲���ģʽ������ϵͳ�ṩ���࣬�������ע���û��������������ݱ仯ʱ���ص��û���
 */
public class Observer2Main {

	public static void main(String[] args) {

		Server1 server1 = new Server1();
		Server2 server2 = new Server2();
		
		Client client = new Client();
		
		client.registerServer(server1);
		client.registerServer(server2);
		System.out.println("Observer2Main");
		server1.setMsg("Server1'nums : 110 ");  
		server2.setMsg("Server2'nums : 12,13,31,5,4,3 15"); 
		
	}

}
