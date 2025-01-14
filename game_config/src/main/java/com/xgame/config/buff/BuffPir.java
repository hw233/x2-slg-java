package com.xgame.config.buff;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:17 
 */
public class BuffPir extends BaseFilePri{
	
	/**﻿BuffId*/
	int Id;
	/**buff效果类型（1：属性变化类,2:触发被动技能类，3：改变AI行为类，4特殊效果类:如控制类buff)*/
	int buffEffectType;
	/**buff组（用于判断相同组的buff效果是否可叠加）（buff组5和8的叠加规则特殊 无视buff来源）*/
	int buffGroup;
	/**属填属性id(血量：106，命中：115，闪避：116)*/
	int attrId;
	/**属性变化的数值(百分比+固定点数  id 1110的buff 填入 1;0  表示对目标造成100%*X+0点的伤害     (当attrId=106 且 zengJian=2时 X表示伤害公式计算出的伤害 ，其他情况下 X表示玩家的attrValue填的属性)     )*/
	Object attrValue;
	/**增减益（1 增 2 减）  */
	int zengJian;
	/**buff触发几率 （Value1+Value2*SkillLv，填50；10  表示  50%+10%*技能等级）*/
	Object happenValue;
	/**持续时间（只用于持续类buff，非持续类buff填-1）*/
	double continueTime;
	/**持续时间内有效次数（只用于持续类buff，非持续类buff填-1）（生产次数满了之后特效消失）*/
	int validNum;
	/**触发间隔（只用于持续类buff，非持续类buff填-1）*/
	double happenFrequnce;
	/**相同buff组最大可以叠加次数(新buff直接替换老buff) （同一个来源）*/
	int coverNum;
	/**叠加类型（1 效果 2 时间)*/
	int addType;
	/**BUFF图标*/
	Object buffPicture;
	/**特效Id*/
	Object effectId;
	/**相同buff组是否可共存(不同来源)*/
	int coexist;
	
	
	
	/**﻿BuffId*/
	public int getId(){
		return Id;
	}
	/**buff效果类型（1：属性变化类,2:触发被动技能类，3：改变AI行为类，4特殊效果类:如控制类buff)*/
	public int getBuffEffectType(){
		return buffEffectType;
	}
	/**buff组（用于判断相同组的buff效果是否可叠加）（buff组5和8的叠加规则特殊 无视buff来源）*/
	public int getBuffGroup(){
		return buffGroup;
	}
	/**属填属性id(血量：106，命中：115，闪避：116)*/
	public int getAttrId(){
		return attrId;
	}
	/**属性变化的数值(百分比+固定点数  id 1110的buff 填入 1;0  表示对目标造成100%*X+0点的伤害     (当attrId=106 且 zengJian=2时 X表示伤害公式计算出的伤害 ，其他情况下 X表示玩家的attrValue填的属性)     )*/
	@SuppressWarnings("unchecked")
	public <T> T getAttrValue(){
		return (T)attrValue;
	}
	/**增减益（1 增 2 减）  */
	public int getZengJian(){
		return zengJian;
	}
	/**buff触发几率 （Value1+Value2*SkillLv，填50；10  表示  50%+10%*技能等级）*/
	@SuppressWarnings("unchecked")
	public <T> T getHappenValue(){
		return (T)happenValue;
	}
	/**持续时间（只用于持续类buff，非持续类buff填-1）*/
	public double getContinueTime(){
		return continueTime;
	}
	/**持续时间内有效次数（只用于持续类buff，非持续类buff填-1）（生产次数满了之后特效消失）*/
	public int getValidNum(){
		return validNum;
	}
	/**触发间隔（只用于持续类buff，非持续类buff填-1）*/
	public double getHappenFrequnce(){
		return happenFrequnce;
	}
	/**相同buff组最大可以叠加次数(新buff直接替换老buff) （同一个来源）*/
	public int getCoverNum(){
		return coverNum;
	}
	/**叠加类型（1 效果 2 时间)*/
	public int getAddType(){
		return addType;
	}
	/**BUFF图标*/
	@SuppressWarnings("unchecked")
	public <T> T getBuffPicture(){
		return (T)buffPicture;
	}
	/**特效Id*/
	@SuppressWarnings("unchecked")
	public <T> T getEffectId(){
		return (T)effectId;
	}
	/**相同buff组是否可共存(不同来源)*/
	public int getCoexist(){
		return coexist;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}