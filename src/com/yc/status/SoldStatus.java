package com.yc.status;
/**
 *@Author Administrator
 *@Time 2016-4-14 ����12:55:14
 */
public class SoldStatus implements Status {

	private Machine machine;
	
	
	public SoldStatus(Machine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertMoney() {
		System.out.println("���Ѿ�Ͷ��Ӳ�ң�������Ͷ");
	}

	@Override
	public void backMoney() {
		System.out.println("���ڳ������޷��˱�");
	}

	@Override
	public void turnCrank() {
		System.out.println("���ڳ����������ظ�ҡ���ֱ�");
	}

	@Override
	public void dispense() {
		machine.dispense();
		if (machine.getCount() > 0){
			machine.setStatus(machine.getNoMoneyStatus());
		}else{
			machine.setStatus(machine.getSoldOutStatus());
		}
		
	}

}
