package com.yc.command;
/**
 *@Author Administrator
 *@Time 2016-4-9 ����12:37:41
 *
 *����һ�������࣬��ִ��һϵ������
 */
public class QuickCommand implements Command {

	private Command[] commands;
	public QuickCommand(Command[] commands) {
		super();
		this.commands = commands;
	}

	@Override
	public void execute() {
		System.out.println("�����࿪ʼִ��");
		for (int i = 0; i < commands.length; i++)
		{
			commands[i].execute();
		}
		System.out.println("���������ִ��");
	}

}
