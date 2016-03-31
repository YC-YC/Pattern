package com.yc.chain;

import java.util.Random;

import com.yc.chain.handle.RequestHandle;
import com.yc.chain.handle.RequestHandleFactory;

/**
 * @Author Administrator
 * @Time 2016-3-31 ����10:42:05
 */
public class TestMain {

	private RequestHandle handle;

	/**�÷���Ϊ�˽������ֻ��עһ��RequestHandle �ӿڣ������ع�עSales,Leader��*/
	public void setHandle(RequestHandle handle) {
		this.handle = handle;
	}

	public void request(float request) {
		handle.handleRequest(request);
	}

	public static void main(String[] args) {
		TestMain client = new TestMain();
		client.setHandle(RequestHandleFactory.createHandle());
		
		Random rand = new Random();
		for (int i = 0; i < 100; i++)
		{
			System.out.println(i + ":");
			client.request(rand.nextFloat());
		}

	}

}
