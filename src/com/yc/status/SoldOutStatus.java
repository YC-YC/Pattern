package com.yc.status;
/**
 *@Author Administrator
 *@Time 2016-4-14 ����12:55:14
 */
public class SoldOutStatus implements Status {

	private Machine machine;
	
	
	public SoldOutStatus(Machine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void insertMoney() {
		System.out.println("����Ϊ�գ��벻ҪͶ��");
	}

	@Override
	public void backMoney() {
		System.out.println("��û��Ͷ��Ӳ��");
	}

	@Override
	public void turnCrank() {
		System.out.println("��Ʒ���꣬ҡ��Ҳû����");
	}

	@Override
	public void dispense() {
		throw new IllegalStateException("�Ƿ�״̬");
	}

}
