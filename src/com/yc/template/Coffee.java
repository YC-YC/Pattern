package com.yc.template;
/**
 *@Author Administrator
 *@Time 2016-3-28 ����10:30:56
 */
public class Coffee extends ITemplate {

	@Override
	protected void brew() {
		System.out.println("���ݿ���");
	}

	@Override
	protected void addCondiments() {
		System.out.println("�������");
	}

}
