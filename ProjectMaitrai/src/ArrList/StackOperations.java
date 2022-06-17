package ArrList;

import java.util.Iterator;
import java.util.Stack;

public class StackOperations {
		public static void main(String[] args) {
			Stack<Integer> s= new Stack<>();   
			s.push(10);  
			s.push(12);  
			s.push(33);
			s.push(23);				
			System.out.println("Elements in Stack: " +s);
			System.out.println("Searched Element: " +s.search(23));
			System.out.println("pick: " +s.peek());
			System.out.println("delete Element: " +s.pop());
			System.out.println(" Elements: " +s);
			System.out.println(s.push(30));			
			System.out.println(" Elements: " +s);
					
									
			}
	
		
		}
	


