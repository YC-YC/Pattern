package com.yc.status;

/**
 * @Author Administrator
 * @Time 2016-4-14 ����12:55:14
 */
public class WinStatus implements Status {

	private Machine machine;

	public WinStatus(Machine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertMoney() {
		throw new IllegalStateException("�Ƿ�״̬");
	}

	@Override
	public void backMoney() {
		throw new IllegalStateException("�Ƿ�״̬");
	}

	@Override
	public void turnCrank() {
		throw new IllegalStateException("�Ƿ�״̬");
	}

	@Override
	public void dispense() {
		System.out.println("��ϲ���н���");
		machine.dispense();
		if (machine.getCount() <= 0) {
			System.out.println("�Ѿ�����");
			machine.setStatus(machine.getSoldOutStatus());
		} else {
			machine.dispense();
			if (machine.getCount() > 0) {
				machine.setStatus(machine.getNoMoneyStatus());
			} else {
				System.out.println("�Ѿ�����");
				machine.setStatus(machine.getSoldOutStatus());
			}
		}

	}

}
