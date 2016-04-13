package com.yc.status;

import java.util.Random;

/**
 *@Author Administrator
 *@Time 2016-4-14 ����12:55:14
 */
public class HasMoneyStatus implements Status {

	private Machine machine;
	
	
	public HasMoneyStatus(Machine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertMoney() {
		System.out.println("���Ѿ�Ͷ��Ӳ�ң�������Ͷ");
	}

	@Override
	public void backMoney() {
		System.out.println("�����˱�");
		machine.setStatus(machine.getNoMoneyStatus());
	}

	@Override
	public void turnCrank() {
		System.out.println("ת���ֱ�");
		int random = new Random().nextInt(10);
		if (random == 5){
			machine.setStatus(machine.getWinStatus());
		}else{
			machine.setStatus(machine.getSoldStatus());
		}
	}

	@Override
	public void dispense() {
		throw new IllegalStateException("�Ƿ�״̬");
	}

}
