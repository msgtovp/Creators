package org.creators.obj.square;
import org.creators.io.Shape;
public class Rectangle extends Shape{
	private double length, breadth;
	public Rectangle(String color, float cost, double length, double breadth) {
		super(color, cost);
		this.length = length;
		this.breadth = breadth;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public double getLength() {
		return this.length;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	public double getBreadth() {
		return this.breadth;
	}
	public double area() {
		return this.length * this.breadth;
	}
}
