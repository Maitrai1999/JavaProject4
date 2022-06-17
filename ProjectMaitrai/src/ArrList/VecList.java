package ArrList;

import java.util.*;

public class VecList {

	public static void main(String[] args) {
				Vector<String>vec=new Vector<>();
				Vector<Integer>vec1=new Vector<>();
						vec.add("Irfana");
						vec.add("Yamini");
						vec.add("Maitrai");
						vec.add("Dhivya");
						vec.add("Irfana");
                        vec.add(5,"Irf");
						System.out.println("adding element"+vec.add("Nisha"));
						System.out.println("adding"+vec.addAll(vec));
						System.out.println("finding size"+vec.size());
						System.out.println("finding position"+vec.indexOf("Irfana"));
						System.out.println("finding position"+vec.lastIndexOf("Irfana"));
						Iterator itr=vec.iterator();
						while(itr.hasNext()) {
							System.out.println(itr.next());
						}

					}

				

			



	}


