package com.xgame.config.zhuangJiaMS;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:22 
 */
public class ZhuangJiaMSPir extends BaseFilePri{
	
	/**﻿ID*/
	int id;
	/**底盘0 配件等级（用于衰减排序）*/
	int lv;
	/**武器架 2 小兵种ID（1坦克2自行火炮3巡航导弹车4无人机战车5空对地小型空中单位6空对空小型空中单位7工程抢修车8地对空导弹车9地对地火箭车10导弹拦截车11步兵战车12机枪步兵13防空步兵14电子战车15对空单点直升机16对地单点直升机17对地面伤直升机18特种直升机)*/
	int type;
	/**兵种描述多语言*/
	int desc;
	
	
	
	/**﻿ID*/
	public int getId(){
		return id;
	}
	/**底盘0 配件等级（用于衰减排序）*/
	public int getLv(){
		return lv;
	}
	/**武器架 2 小兵种ID（1坦克2自行火炮3巡航导弹车4无人机战车5空对地小型空中单位6空对空小型空中单位7工程抢修车8地对空导弹车9地对地火箭车10导弹拦截车11步兵战车12机枪步兵13防空步兵14电子战车15对空单点直升机16对地单点直升机17对地面伤直升机18特种直升机)*/
	public int getType(){
		return type;
	}
	/**兵种描述多语言*/
	public int getDesc(){
		return desc;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}