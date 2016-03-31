package com.yc.factory;

import com.yc.factory.concrete.IHair;
import com.yc.factory.concrete.LeftHair;

/**
 *@Author Administrator
 *@Time 2016-3-31 ����11:56:26
 *
 *�򵥹�����һ�������������һ���£����ص��ǽӿ�
 */
public class HairFactory {
	
	public IHair getHair(String key)
	{
		if ("left".equals(key))
		{
			return new LeftHair();
		}
		else if ("right".equals(key))
		{
			return new LeftHair();
		}
		return null;
	}
	
	public IHair getHairByClass(String className)
	{
		try {
			return (IHair) Class.forName(new PropertiesReader().getProgerties().get(className)).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
