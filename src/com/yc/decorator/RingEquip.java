package com.yc.decorator;
/**
 *@Author Administrator
 *@Time 2016-4-7 ����12:19:31
 */
public class RingEquip implements IEquip {

	@Override
	public int attack() {
		return 5;
	}

	@Override
	public String description() {
		return "ʥս��ָ";
	}

}
