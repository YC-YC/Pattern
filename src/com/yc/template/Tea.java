package com.yc.template;
/**
 *@Author Administrator
 *@Time 2016-3-28 ����10:28:20
 */
public class Tea extends ITemplate {

	@Override
	protected void brew() {
		System.out.println("80���ݲ�5����");		
	}

	@Override
	protected void addCondiments() {
		System.out.println("��������");
	}
	
	@Override
	protected boolean isCustomerCondiments() {
		return false;
	}

}
