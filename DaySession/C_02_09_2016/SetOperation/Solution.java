package org.creators;

import org.creators.coll.SetOpt;

public class Solution {
	public static void main(String args[]) {
		SetOpt<Student> so2 = new SetOpt<Student>();
		SetOpt<Student> so1 = new SetOpt<Student>();
		so1.add(new Student(1,"Vijay",true));
		so1.add(new Student(2,"Ajith",true));
		so2.add(new Student(1,"Vijay",true));
		so2.add(new Student(2,"Dhivya",false));
		System.out.println(so1.union(so2));
	}
}
