package org.creators.obj.poly;
import org.creators.io.Shape;
public class Triangle extends Shape{
	private double base, height;
	public Triangle(String color, float cost, double base, double height) {
		super(color, cost);
		this.base = base;
		this.height = height;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public double getBase() {
		return this.base;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public double area() {
		return this.base * this.height * Shape.HALF;
	}
}
