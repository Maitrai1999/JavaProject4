package ArrList;

import java.util.HashMap;

public class HashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0,"Maitrai");
		hm.put(2,"Yamini");
		hm.put(4,"irfana");			
		System.out.println("Elements of hashmap are: "+hm);
		System.out.println("get : "+hm.get(2));
		System.out.println("contains : "+hm.containsKey(2));		
		System.out.println("replace : "+hm.replace(2,"nisha"));
		System.out.println("Elements of hashmap are: "+hm);
		System.out.println("remove : "+hm.remove(0));
		System.out.println("Elements of hashmap are: "+hm);
		System.out.println("absent: "+hm.putIfAbsent(1,"mike"));
		System.out.println("Elements of hashmap are: "+hm);
		System.out.println("entry set: "+hm.entrySet());

		
	}

}
