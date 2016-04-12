package com.yc.strategy.role;

import com.yc.strategy.methodinterface.AttackJYSG;
import com.yc.strategy.methodinterface.AttackXLSBZ;
import com.yc.strategy.methodinterface.DefendTBS;
import com.yc.strategy.methodinterface.Display1;
import com.yc.strategy.methodinterface.Display2;
import com.yc.strategy.methodinterface.RunJCTQ;
import com.yc.strategy.methodinterface.RunYWD;

/**
 *@Author Administrator
 *@Time 2016-3-29 ����10:09:04
 *
 *����ģʽ:
 *	����ܶ��㷨�壬�ֱ��װ������������֮����໥�滻����ģʽ���㷨�ı仯������ʹ���㷨�Ŀͻ�
 *	ÿ���ͻ������Լ���Ҫʹ�ò�ͬ�ļ��ܷ������о�����ӻ⣬Ҫʲô���ܾʹӼ��ܿ���newһ����
 *
 */
public class StrategyMain {

	public static void main(String[] args) {
		Role role = new RoleA("��ɫ1");
		role.setmAttackBehavior(new AttackJYSG())
			.setmDefendBehavior(new DefendTBS())
			.setmDisplayBehavior(new Display1())
			.setmRunBehavior(new RunYWD());
		
		System.out.println(role.getName() + ":");
		role.attack();
		role.defend();
		role.display();
		role.run();
		
		System.out.println("\n----------------\n");
		
		role = new RoleB("��ɫ2");
		role.setmAttackBehavior(new AttackXLSBZ())
			.setmDefendBehavior(new DefendTBS())
			.setmDisplayBehavior(new Display2())
			.setmRunBehavior(new RunJCTQ());
		
		System.out.println(role.getName() + ":");
		role.attack();
		role.defend();
		role.display();
		role.run();
	}

}
