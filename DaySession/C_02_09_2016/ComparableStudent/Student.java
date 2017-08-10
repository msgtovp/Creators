package org.creators;
/**
 * This class is used to store student bio data
 * @author vijay
 *
 */
public class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	private boolean gender;
	/**
	 * This contructor initialize with passed arguments
	 * @param rollNo
	 * @param name
	 * @param gender
	 */
	public Student(int rollNo, String name, boolean gender) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;
	}
	@Override
	public int compareTo(Student o) {
		return ((Integer)this.getRollNo()).compareTo(o.getRollNo());
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", gender=" + gender + "]";
	}	
}
