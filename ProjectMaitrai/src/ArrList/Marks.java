package ArrList;

public class Marks {
	
final	int marks;
public Marks(int m)
{
	marks=m;
}
	  void   Mark() {
		  System.out.println("marks are:"+marks);
		  
	  }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Marks obj=new Marks(50);
	        obj.Mark();
		}

}
