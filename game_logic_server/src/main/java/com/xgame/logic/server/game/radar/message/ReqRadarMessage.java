package com.xgame.logic.server.game.radar.message;
import com.xgame.msglib.ReqMessage;

import com.xgame.msglib.able.Communicationable;

/** 
 * @author ProtocolEditor
 * Radar-ReqRadar - 所有入侵者的信息
 */
public class ReqRadarMessage extends ReqMessage {
	
	//模块号+消息号
	public static final int ID=301201;
	//模块号
	public static final int FUNCTION_ID=301;
	//消息号
	public static final int MSG_ID=201;
	

		
	@Override
	public int getId() {
		return ID;
	}

	@Override
	public String getQueue() {
		return "s2s";
	}
	
	@Override
	public String getServer() {
		return null;
	}
	
	@Override
	public boolean isSync() {
		return false;
	}

	@Override
	public CommandEnum getCommandEnum() {
		return Communicationable.CommandEnum.PLAYERMSG;
	}
	
	@Override
	public HandlerEnum getHandlerEnum() {
		return Communicationable.HandlerEnum.CS;
	}
	
	@Override
	public String toString(){
		StringBuffer buf = new StringBuffer("[");

		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("},");
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("]");
		return buf.toString();
	}
}