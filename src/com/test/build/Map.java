package com.test.build;

import com.test.element.DefenseTower;
import com.test.element.Monster;
import com.test.element.Road;
import com.test.element.Tree;

public class Map {
	private DefenseTower defenseTower; //·ÀÓùËş
	private Road road;  //µÀÂ·
	private Tree tree;  // Ê÷
	private Monster monster;  // ¹ÖÎï
	private String music;  //ÒôÀÖ
	private String px;  //ÏñËØ
	
	public DefenseTower getDefenseTower() {
		return defenseTower;
	}
	public void setDefenseTower(DefenseTower defenseTower) {
		this.defenseTower = defenseTower;
	}
	public Road getRoad() {
		return road;
	}
	public void setRoad(Road road) {
		this.road = road;
	}
	public Tree getTree() {
		return tree;
	}
	public void setTree(Tree tree) {
		this.tree = tree;
	}
	public Monster getMonster() {
		return monster;
	}
	public void setMonster(Monster monster) {
		this.monster = monster;
	}
	public String getMusic() {
		return music;
	}
	public void setMusic(String music) {
		this.music = music;
	}
	public String getPx() {
		return px;
	}
	public void setPx(String px) {
		this.px = px;
	}
	@Override
	public String toString() {
		return "Map:\r\n defenseTower=" + defenseTower + "\r\n"+" road=" + road + "\r\n"+" tree=" + tree +"\r\n"+
				" monster=" + monster+"\r\n"
				+ " music=" + music + "\r\n"+" px=" + px + "]";
	}
	
}
