package ArrList;
import java.util.ArrayList;
import java.util.Iterator;

		public class ArrayListCollection {

			public static void main(String[] args) {
				ArrayList<String>list=new ArrayList<String>();
				list.add("Irfana");
				list.add("Yamini");
				list.add("Maitrai");
				list.add("Dhivya");
				list.add("Irfana");

				System.out.println("access element"+list.get(2));
				//System.out.println("deleted element"+list.remove(4));
				System.out.println("finding size"+list.size());
				System.out.println("finding position"+list.indexOf("Irfana"));
				System.out.println("finding position"+list.lastIndexOf("Irfana"));
				Iterator itr=list.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}

			}

		

	}


