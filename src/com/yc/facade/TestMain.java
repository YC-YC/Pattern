package com.yc.facade;
/**
 *@Author Administrator
 *@Time 2016-4-13 ����12:31:13
 * ���ģʽ��Facade Pattern��
 * ���壺�ṩһ��ͳһ�Ľӿڣ�����������ϵͳ�е�һȺ�ӿڣ���۶�����һ���߲�Ľӿڣ�����ϵͳ������ʹ��
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HomeTheaterFacade facade = new HomeTheaterFacade(new Computer(),
				new Player(), 
				new Control());
		facade.watchMovie();
		facade.stopMovie();
	}

}
