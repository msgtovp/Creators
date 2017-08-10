package org.creators;

import java.util.Set;
import java.util.TreeSet;

public class Solution {
	public static void main(String args[]) {
		String str = null;
		Set<Student> st = new TreeSet<Student>();
		st.add(new Student(1,"Vijay",true));
		st.add(new Student(2,"Vijay",true));
		System.out.println(st);
	}
}
