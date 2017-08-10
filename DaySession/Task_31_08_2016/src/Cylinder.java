package org.creators.obj.round;
public class Cylinder extends Circle{
	private double height;
	public Cylinder(String color, float cost, double radius, double height) {
		super(color, cost, radius);
		this.height = height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public double area() {
		return this.height * super.area();
	}
}
