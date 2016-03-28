package com.yc.template;
/**
 *@Author Administrator
 *@Time 2016-3-28 ����10:19:43
 *
 *�ʺ���ͳһ�ķ������̣��и��𷽷��ǹ��еģ���ͬ�ķ�������Ϊprotected abstract��������ȥʵ��
 *�ṩΩһ�ķ������ⲿ����
 *��ӹ��Ӻ������Զ���ĳЩ����
 */
public abstract class ITemplate {

	public final void prepareBaverageTemplate(){
		//��ˮ���
		boilWater();
		//��������
		brew();
		//�����ϵ��뱭��
		pourInCup();
		//�������
		if (isCustomerCondiments())
		{
			addCondiments();
		}
		
	}

	
	private void boilWater() {
		System.out.println("��ˮ���");
	}
	
	private void pourInCup() {
		System.out.println("���뱭��");
	}
	
	/**��������*/
	protected abstract void brew();
	/**�������*/
	protected abstract void addCondiments();

	/**��ӹ��Ӻ���*/
	protected boolean isCustomerCondiments()
	{
		return true;
	}


	

	
}
