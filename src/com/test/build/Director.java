package com.test.build;

import com.test.resources.Resources;

public class Director {
	//������ͼ�Ľӿھ���ʵ����
	private Build build = new CreateMap();
	//ģ������û����صĵ�ͼ
	private Resources resources = new Resources();
	//��ʼ������ͼ
	public Map createMap(String px,boolean ishasMusic){
		build.buildRoad(resources.getRoad())
			.buildDefenseTower(resources.getDefenseTower())
			.buildTree(resources.getTree())
			.buildMonster(resources.getMonster())
			.buildMusic(ishasMusic==true?"��������":"������")
			.buildPx(px);
		return build.getMap();
	}
}
