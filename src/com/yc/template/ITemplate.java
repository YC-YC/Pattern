package com.yc.template;
/**
 *@Author Administrator
 *@Time 2016-3-28 下午10:19:43
 */
public abstract class ITemplate {

	public final void prepareBaverageTemplate(){
		//将水煮沸
		boilWater();
		//泡制饮料
		brew();
		//将饮料倒入杯中
		pourInCup();
		//加入调料
		if (isCustomerCondiments())
		{
			addCondiments();
		}
		
	}

	
	private void boilWater() {
		System.out.println("将水煮沸");
	}
	
	private void pourInCup() {
		System.out.println("倒入杯中");
	}
	
	/**泡制饮料*/
	protected abstract void brew();
	/**加入调料*/
	protected abstract void addCondiments();

	/**添加钩子函数*/
	protected boolean isCustomerCondiments()
	{
		return true;
	}


	

	
}
