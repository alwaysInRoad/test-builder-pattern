package com.test.clienter;

import com.test.build.Director;
import com.test.build.Map;

public class Clienter {
	public static void main(String[] args) {
		//����ӵ��һ�������ߡ� ����Ϸ������ܾ���һ����ť��
		Director director = new Director();
		//��Ҫ��Ʒ�ʣ����Ҽ����ֵ�
		Map createMap = director.createMap("100%", true);
		System.out.println(createMap);
		//��Ʒ�ʵĻ���
		Map createMap1 = director.createMap("80%", true);
		System.out.println(createMap1);
		//����̫���ˣ���Ʒ�ʵ�
		Map createMap2 = director.createMap("50%", false);
		System.out.println(createMap2);
	}
}
