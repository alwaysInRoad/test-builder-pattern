package com.test.build;

import com.test.resources.Resources;

public class Director {
	//创建地图的接口具体实现类
	private Build build = new CreateMap();
	//模拟加载用户下载的地图
	private Resources resources = new Resources();
	//开始构建地图
	public Map createMap(String px,boolean ishasMusic){
		build.buildRoad(resources.getRoad())
			.buildDefenseTower(resources.getDefenseTower())
			.buildTree(resources.getTree())
			.buildMonster(resources.getMonster())
			.buildMusic(ishasMusic==true?"加载音乐":"无音乐")
			.buildPx(px);
		return build.getMap();
	}
}
