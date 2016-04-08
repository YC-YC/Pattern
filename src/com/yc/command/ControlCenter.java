package com.yc.command;
/**
 *@Author Administrator
 *@Time 2016-4-9 ����12:17:02
 */
public class ControlCenter {
	private static final int CONTROL_SIZE = 9; 
	
	
	private Command[] commands;
	public ControlCenter() {
		commands = new Command[9];
		for (int i = 0; i < CONTROL_SIZE; i++)
		{
			commands[i] = new NoCommand();
		}
	}
	
	/**�ṩ���ð�����Ӧ����ķ���*/
	public void setCommand(int index, Command command)
	{
		commands[index] = command;
	}
	
	/**ģ��ִ�а���*/
	public void onKeyDown(int index)
	{
		commands[index].execute();
	}
}
