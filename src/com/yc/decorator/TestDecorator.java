package com.yc.decorator;
/**
 *@Author Administrator
 *@Time 2016-4-7 ����12:16:08
 *
 *�����ģʽ�������ǣ�����ģʽ����ѡ��ִ�еײ㷽����װ����ģʽ��Ҫһ��ִ�У���������װ�ε����ã�
 */
public class TestDecorator {

	public static void main(String[] args) {

		System.out.println("2���챦ʯ��1������ʯװ�ε�����");
		IEquip equip = new RedDiamondDecorator(new RedDiamondDecorator(new YellowDiamondDecorator(new ArmEquip())));
	
		System.out.println("������Ϊ��" + equip.attack());
		System.out.println("����Ϊ��" + equip.description());
	}

}
