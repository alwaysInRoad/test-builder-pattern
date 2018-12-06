package com.test.element;

public class Road {
	private int width; //路的尺寸
	private int length; //路的长度
	private int x;  //路的x坐标
	private int y;  //路的y坐标
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
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
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Road(int width, int length, int x, int y) {
		super();
		this.width = width;
		this.length = length;
		this.x = x;
		this.y = y;
	}
	public Road() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Road [width=" + width + ", length=" + length + ", x=" + x + ", y=" + y + "]";
	}
	
}
