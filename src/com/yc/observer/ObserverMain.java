package com.yc.observer;
/**
 *@Author Administrator
 *@Time 2016-3-30 ����12:50:59
 *
 *�۲���ģʽ���������ע���û��������������ݱ仯ʱ���ص��û���
 */
public class ObserverMain {

	public static void main(String[] args) {
		ServerFor3D serverFor3D = new ServerFor3D();
		
		IClient client1 = new Client1(serverFor3D);
		IClient client2 = new Client2(serverFor3D);
		
		serverFor3D.setMsg("20160330��3D�����ǣ�127");
		serverFor3D.setMsg("20160331��3D�����ǣ�127");
	}

}
