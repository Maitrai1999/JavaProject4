package ArrList;

public class Animal {
	final void characteristics() {
    	 int legs=4;
    	 int eyes=2;
    	 int tail=1;
    	 System.out.println("characteristics of an animal are:");
    	 System.out.println("legs:"+legs);
    	 System.out.println("eyes:"+eyes);
    	 System.out.println("tail:"+tail);
     }
/* public class Dog extends Animal{
	final void sound() {
		 System.out.println();
		 System.out.println("additional characteristics :");
		 System.out.println("sound: bow bow"); 
	}
}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal d=new Animal();
		d.characteristics();
		
	}
	
	}
	


