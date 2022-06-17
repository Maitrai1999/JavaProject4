package ArrList;

import java.util.LinkedHashSet;

public class OddLinkHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();
		s.add(2);
		s.add(4);
		s.add(6);
		s.add(8);
		s.add(10);
		LinkedHashSet<Integer> s1= new LinkedHashSet<Integer>();       
		s1.add(1);
		s1.add(3);
		s1.add(5);	
		s1.add(7);
		s1.add(9);
		System.out.println("Elements of s: "+s);
		System.out.println("Elements of s1: "+s1);
		s1.removeAll(s);
	    System.out.println(" odd numbers are : "+s1);
		//s.retainAll(s1);
		//System.out.println("odd numbers are : "+s);
	//	s.addAll(s1);
	//	System.out.println("union is : "+s);
		

	}

}
