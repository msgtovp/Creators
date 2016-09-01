package org.creators;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public static void main(String args[]) {
		List<Student> li = new LinkedList<Student>();
		li.add(new Student(1,"Vijay",true));
		li.add(new Student(2,"Ajith",true));
		li.add(new Student(3,"Dhivya",false));
		System.out.println(li);
		System.out.println("RollNo\tName\tGender");
		for(Student st:li) {
			System.out.println(st.getRollNo()+"\t"+st.getName()+"\t"+(st.isGender()?"Male":"Female"));
		}
	}
}
