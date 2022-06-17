package ArrList;

import java.util.HashSet;

public class HashIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> s=new HashSet<Integer>();
		s.add(0);
		s.add(2);
		s.add(4);
		HashSet<Integer> s1=new HashSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(5);					
		System.out.println("Elements of s: "+s);
		System.out.println("Elements of s1: "+s1);
		s.retainAll(s1);
		System.out.println("intersection is : "+s);
	}	

	}


