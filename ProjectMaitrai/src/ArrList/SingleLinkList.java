package ArrList;


	import java.util.*;
	import java.util.Iterator;
	import java.util.LinkedList;

	public class SingleLinkList {
		private static final LinkedList<Integer> list1 = null;
		
		public static void main(String[] args) {
			LinkedList<Integer>list=new LinkedList<Integer>();
			list.add(22);
			list.add(24);
			list.add(31);
		    list.add(24);
			list.add(5);
			list.addFirst(10);
			list.addLast(15);
			System.out.println("LinkedList: " + list);
			System.out.println("access element"+list.get(2));
			System.out.println("deleted element"+list.remove(4));
			System.out.println("finding size"+list.size());
			System.out.println("finding position"+list.indexOf(24));
			System.out.println("finding position"+list.lastIndexOf(24));
			System.out.println("element"+list.getFirst());
			System.out.println("element"+list.getLast());
			System.out.println("element"+list.removeFirst());
			System.out.println("element"+list.removeLast());
			 Iterator itr=list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			} 

		}


	}

			



