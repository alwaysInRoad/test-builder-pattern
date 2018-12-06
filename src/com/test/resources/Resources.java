package com.test.resources;

import com.test.element.DefenseTower;
import com.test.element.Monster;
import com.test.element.Road;
import com.test.element.Tree;

/**
 * �ͻ������صĵ�ͼ��Դ
 * @author Administrator
 *
 */
public class Resources {
	//ģ�������˷�����
	public DefenseTower getDefenseTower(){
		return new DefenseTower(12, 50, 50, 100, 80);
	}
	//ģ�������˵�·
	public Road getRoad(){
		return new Road(300, 2000, 50, 50);
	}
	//ģ����������
	public Tree getTree(){
		return new Tree("��ɫ", 5, 20, 100);
	}
	//ģ��������Ұ��
	public Monster getMonster(){
		return new Monster(18, 60, 150, 75, 40);
	}
}
