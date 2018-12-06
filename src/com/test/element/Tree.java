package com.test.element;

public class Tree {
	private String color;  //����ɫ
	private int size;  //���ߴ�
	private int x;  //��x����
	private int y;  //��y����
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

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

	public Tree(String color, int size, int x, int y) {
		super();
		this.color = color;
		this.size = size;
		this.x = x;
		this.y = y;
	}

	public Tree() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tree [color=" + color + ", size=" + size + ", x=" + x + ", y=" + y + "]";
	}
	
}
