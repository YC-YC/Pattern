package com.yc.factory;

import com.yc.factory.concrete.Boy;
import com.yc.factory.concrete.Girl;

/**
 * @author Administrator
 * @time 2016-4-1
 * ���󹤳����������һ���¼�
 */
public interface PersonFactory {
	public Boy getBoy();
	public Girl getGirl();
}
