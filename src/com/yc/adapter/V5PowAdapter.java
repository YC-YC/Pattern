package com.yc.adapter;
/**
 *@Author Administrator
 *@Time 2016-4-13 ����12:16:49
 */
public class V5PowAdapter implements V5Power{

	private V220Power v220Power;

	public V5PowAdapter(V220Power v220Power) {
		super();
		this.v220Power = v220Power;
	}

	@Override
	public int provideV5Power() {
		int power = v220Power.provideV220Power();
		System.out.println("ͨ�����䣬��220Vת��5V��ѹ");
		return 5;
	}
	
}
