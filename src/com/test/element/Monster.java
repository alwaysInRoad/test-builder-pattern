package com.test.element;

public class Monster {
	private int size; //³ß´ç
	private int x;  //x×ø±ê
	private int y; //y×ø±ê
	private int aggressivity; //¹ÖÊÞ¹¥»÷Á¦
	private int defenseValue;  //¹ÖÊÞ·ÀÓùÖµ
	
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getAggressivity() {
		return aggressivity;
	}


	public void setAggressivity(int aggressivity) {
		this.aggressivity = aggressivity;
	}


	public int getDefenseValue() {
		return defenseValue;
	}


	public void setDefenseValue(int defenseValue) {
		this.defenseValue = defenseValue;
	}


	public Monster(int size, int x, int y, int aggressivity, int defenseValue) {
		super();
		this.size = size;
		this.x = x;
		this.y = y;
		this.aggressivity = aggressivity;
		this.defenseValue = defenseValue;
	}

	public Monster() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Monster [size=" + size + ", x=" + x + ", y=" + y + ", aggressivity=" + aggressivity + ", defenseValue="
				+ defenseValue + "]";
	}
	
}
