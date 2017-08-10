package org.creators.obj.round;
import org.creators.io.Shape;
public class Circle extends Shape{
	private double radius;
	public Circle(String color, float cost, double radius) {
		super(color, cost);
		this.radius = radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public double area() {
		return this.radius * this.radius * Shape.PI;
	}
}
