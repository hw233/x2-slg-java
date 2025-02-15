package com.xgame.logic.server.game.playerattribute.calculation;

import org.springframework.stereotype.Component;

import com.xgame.logic.server.game.playerattribute.constant.AttributesEnum;

@Component
public class Counter117 extends AttributeCounter {

	@Override
	public AttributesEnum getSelfAttribute() {
		return AttributesEnum.CRIT;
	}

	@Override
	public AttributesEnum getRelationAttribute() {
		return AttributesEnum.CRIT_PER;
	}

}
