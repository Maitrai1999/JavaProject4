package ArrList;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("maitrai");
		ts.add("maitrai");
		ts.add("yamini");
		ts.add("irfana");
		ts.add("keerthi");
		ts.add("shruti");	
		System.out.println(ts);
		System.out.println("first:"+ts.first());
		System.out.println("last:"+ts.last());
		System.out.println("remove:"+ts.remove("yamini"));
		System.out.println("higher:"+ts.higher("keerthi"));
		System.out.println("lower:"+ts.lower("irfana"));
		System.out.println(ts);
		System.out.println("pollfirst:"+ts.pollFirst());
		System.out.println("polllast:"+ts.pollLast());
		System.out.println("descending:"+ts.descendingSet());
					
			}

}
