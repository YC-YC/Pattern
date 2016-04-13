package com.yc.status;
/**
 *@Author Administrator
 *@Time 2016-4-14 ����12:55:14
 */
public class NoMoneyStatus implements Status {

	private Machine machine;
	
	
	public NoMoneyStatus(Machine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertMoney() {
		System.out.println("Ͷ�ҳɹ�");
		machine.setStatus(machine.getHasMoneyStatus());
	}

	@Override
	public void backMoney() {
		System.out.println("����û��Ͷ��Ӳ��");
	}

	@Override
	public void turnCrank() {
		System.out.println("����û��Ͷ��Ӳ��");
	}

	@Override
	public void dispense() {
		throw new IllegalStateException("����û��Ͷ��Ӳ��");
	}

}
