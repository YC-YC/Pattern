package com.yc.adapter;
/**
 *@Author Administrator
 *@Time 2016-4-13 ����12:10:27
 *������ģʽ
 *���壺��һ����Ľӿ�ת���ɿͻ���������һ���ӿڣ���������ԭ���ӿڲ����ݵ�������໥����
 */
public class TestMain {

	public static void main(String[] args) {

		/**
		 * ������һ���ֻ�����Ҫ�ṩ5V��ѹ��磬������ֻ��220V�ĵ�ѹ
		 */
		Mobile mobile = new Mobile();
		V220Power v220Power = new V220Power();
		mobile.inputPower(new V5PowAdapter(v220Power));
	}

}
