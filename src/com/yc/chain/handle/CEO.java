package com.yc.chain.handle;
/**
 *@Author Administrator
 *@Time 2016-3-31 ����10:47:11
 */
public class CEO extends RequestHandle {

	@Override
	public void handleRequest(float request) {
		if (request <= 0.65)
		{
			System.out.println(this.getClass().getName() + "��Ӧ������" + request);
		}
		else
		{
			System.out.println("������Ӧ����" + request);
		}
	}

}
