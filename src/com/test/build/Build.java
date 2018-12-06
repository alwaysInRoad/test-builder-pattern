package com.test.build;

import com.test.element.DefenseTower;
import com.test.element.Monster;
import com.test.element.Road;
import com.test.element.Tree;

public interface Build {
	Build  buildDefenseTower(DefenseTower defenseTower); //����������
	Build  buildRoad(Road road); //������·
	Build  buildTree(Tree tree); //������
	Build  buildMonster(Monster monster); //��������
	Build  buildMusic(String music); //������������
	Build  buildPx(String px); //����������
	Map getMap();  //�õ������ĵ�ͼ
}
