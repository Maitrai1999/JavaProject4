package ArrList;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();
		s.add(0);
		s.add(2);
		s.add(4);
		LinkedHashSet<Integer> s1= new LinkedHashSet<Integer>();       
		s1.add(1);
		s1.add(2);
		s1.add(5);					
		System.out.println("Elements of s: "+s);
		System.out.println("Elements of s1: "+s1);
		//s.removeAll(s1);
	//	System.out.println("difference is : "+s);
	//	s1.retainAll(s);
	//	System.out.println("intersection is : "+s1);
		s.addAll(s1);
		System.out.println("union is : "+s);
		for (int i : s)
            System.out.print(s + ", ");

				
		
		
	}	

	}


