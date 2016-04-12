package com.yc.facade;
/**
 *@Author Administrator
 *@Time 2016-4-13 ����12:32:52
 */
public class HomeTheaterFacade {

	/**
	 * ����
	 * 1������Ӱ��Ҫ
	 * 		�򿪵���
	 * 		�򿪲�����
	 * 		����
	 * 		
	 * 2���رյ�Ӱ
	 * 		ֹͣ����	
	 * 		�رղ�����
	 * 		�رյ���
	 */
	private Computer computer;
	private Player player;
	private Control control;
	public HomeTheaterFacade(Computer computer, Player player, Control control) {
		super();
		this.computer = computer;
		this.player = player;
		this.control = control;
	}
	
	public void watchMovie(){
		this.computer.on();
		this.player.open();
		this.control.play();
	}
	
	public void stopMovie(){
		this.control.stop();
		this.player.close();
		this.computer.off();
	}
}
