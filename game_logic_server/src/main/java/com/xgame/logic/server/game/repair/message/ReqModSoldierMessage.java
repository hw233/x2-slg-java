package com.xgame.logic.server.game.repair.message;
import com.xgame.logic.server.game.repair.bean.ModSoldierBean;
import java.util.ArrayList;
import java.util.List;
import com.xgame.msglib.ReqMessage;

import com.xgame.msglib.able.Communicationable;
import com.xgame.msglib.annotation.MsgField;
/** 
 * @author ProtocolEditor
 * Repair-ReqModSoldier - 请求修理
 */
public class ReqModSoldierMessage extends ReqMessage {
	
	//模块号+消息号
	public static final int ID=105200;
	//模块号
	public static final int FUNCTION_ID=105;
	//消息号
	public static final int MSG_ID=200;
	
	/***/
	@MsgField(Id = 1)
	public int useType;
	/***/
	@MsgField(Id = 2)
	public List<ModSoldierBean> mfb = new ArrayList<ModSoldierBean>();
		
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
		buf.append("useType:" + useType +",");
		buf.append("mfb:{");
		for (int i = 0; i < mfb.size(); i++) {
			buf.append(mfb.get(i).toString() +",");
		}
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("},");
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("]");
		return buf.toString();
	}
}