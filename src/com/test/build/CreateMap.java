package com.test.build;

import com.test.element.DefenseTower;
import com.test.element.Monster;
import com.test.element.Road;
import com.test.element.Tree;

public class CreateMap implements Build{
	private Map map = new Map();
	@Override
	public Map getMap() {
		return map;
	}
	
	@Override
	public CreateMap  buildDefenseTower(DefenseTower defenseTower) {
		map.setDefenseTower(defenseTower);
		return this;
	}
	
	@Override
	public CreateMap  buildRoad(Road road) {
		map.setRoad(road);
		return this;
	}

	@Override
	public CreateMap buildTree(Tree tree) {
		map.setTree(tree);
		return this;
	}

	@Override
	public CreateMap buildMonster(Monster monster) {
		map.setMonster(monster);
		return this;
	}
	
	@Override
	public CreateMap buildMusic(String music) {
		map.setMusic(music);
		return this;
	}

	@Override
	public CreateMap buildPx(String px) {
		map.setPx(px);
		return this;
	}

}
