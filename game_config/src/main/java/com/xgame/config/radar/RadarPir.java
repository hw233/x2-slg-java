package com.xgame.config.radar;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:21 
 */
public class RadarPir extends BaseFilePri{
	
	/**﻿等级*/
	int level;
	/**描述*/
	int description;
	/**目标资源数量(侦查)（填1表示可以侦查到资源）*/
	int resources;
	/**驻军建筑数量(侦查)*/
	int carrison_num;
	/**驻军兵种数量(填写为百分比填写：例如0.4，显示的数量与真实数量上下误差)(侦查)*/
	double garrison_num;
	/**防御塔建筑数量(侦查)*/
	int defense_num;
	/**防御塔等级(侦查)*/
	double defense_level;
	/**来袭兵种类型(预警)*/
	int enemy_type;
	/**来袭兵种数量（填写为百分比填写：例如0.4，显示的数量与真实数量上下误差）(预警)*/
	double enemy_num;
	/**敌军到达时间(预警)*/
	int time;
	
	
	
	/**﻿等级*/
	public int getLevel(){
		return level;
	}
	/**描述*/
	public int getDescription(){
		return description;
	}
	/**目标资源数量(侦查)（填1表示可以侦查到资源）*/
	public int getResources(){
		return resources;
	}
	/**驻军建筑数量(侦查)*/
	public int getCarrison_num(){
		return carrison_num;
	}
	/**驻军兵种数量(填写为百分比填写：例如0.4，显示的数量与真实数量上下误差)(侦查)*/
	public double getGarrison_num(){
		return garrison_num;
	}
	/**防御塔建筑数量(侦查)*/
	public int getDefense_num(){
		return defense_num;
	}
	/**防御塔等级(侦查)*/
	public double getDefense_level(){
		return defense_level;
	}
	/**来袭兵种类型(预警)*/
	public int getEnemy_type(){
		return enemy_type;
	}
	/**来袭兵种数量（填写为百分比填写：例如0.4，显示的数量与真实数量上下误差）(预警)*/
	public double getEnemy_num(){
		return enemy_num;
	}
	/**敌军到达时间(预警)*/
	public int getTime(){
		return time;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}