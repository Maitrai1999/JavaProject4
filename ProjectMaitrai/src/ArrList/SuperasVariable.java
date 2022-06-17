package ArrList;

public class SuperasVariable {
	String color="White";
}
 class Dog extends SuperasVariable{
	 String color="Black";
	 void printColor() {
		 System.out.println(color);
		 System.out.println(super.color); 
	}
 }
 class TestSuper1
 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.printColor();
	}
 }


 

