package com.yc.command;
/**
 *@Author Administrator
 *@Time 2016-4-9 ����12:02:09
 *
 *���壺�������󡱷�װ�ɶ����Ա�ʹ�ò�ͬ�����󡢶��л�����־��������������������ģʽҲ֧�ֿɳ����Ĳ�����
 *��һ�£��������װ�ɶ��󣬽����������ߺͶ���ִ���߽���
 *����ģʽ���ǰ������װ�ɶ���Ȼ�󽫶����������붯��ִ������ȫ���������ң�����İ�ť�͵���һëǮ��ϵ��û
 *
 */
public class TestMain {

	public static void main(String[] args) {

		Door mDoor = new Door();
		Light mLight = new Light();
		Computer mComputer = new Computer();
		
		ControlCenter controlCenter = new ControlCenter();
		controlCenter.setCommand(0, new DoorOpenCommand(mDoor));
		controlCenter.setCommand(1, new DoorCloseCommand(mDoor));
		controlCenter.setCommand(2, new LightOnCommand(mLight));
		controlCenter.setCommand(3, new LightOffCommand(mLight));
		controlCenter.setCommand(4, new ComputerOnCommand(mComputer));
		controlCenter.setCommand(5, new ComputerOffCommand(mComputer));
		
		controlCenter.onKeyDown(0);
		controlCenter.onKeyDown(1);
		controlCenter.onKeyDown(2);
		controlCenter.onKeyDown(3);
		controlCenter.onKeyDown(4);
		controlCenter.onKeyDown(5);
		
		QuickCommand quickCommand = new QuickCommand(new Command[]{
				new DoorOpenCommand(mDoor),
				new LightOnCommand(mLight),
				new DoorCloseCommand(mDoor),
				new ComputerOnCommand(mComputer),
		});
		controlCenter.setCommand(6, quickCommand);
		controlCenter.onKeyDown(6);
	}

}
