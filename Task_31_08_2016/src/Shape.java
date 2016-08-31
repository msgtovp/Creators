package org.creators.io;
import org.creators.util.Math;
abstract public class Shape implements Math {
	private String color;
	private float cost;
	public Shape(String color, float cost) {
		this.color = color;
		this.cost = cost;
	}
	public String getColor() {
		return this.color;
	}
	public float getCost() {
		return this.cost;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
}
