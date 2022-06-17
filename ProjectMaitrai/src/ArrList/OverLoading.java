package ArrList;

public class OverLoading {
	/*   private static void sum(int a,int b){
	        System.out.println(a+b);
	    }

	    private static void sum(int a, int b,int c){
	        System.out.println(a+b+c);
	    }

	    public static void main(String[] args) {
	    	OverLoading obj=new OverLoading();
	        obj.sum(10,10,10);
	        obj.sum(20,20); 
	    } */
  private static int sum(int a,int b){
			return a+b;
	    }

	    private static int sum(int a, int b,int c){
			return a+b+c;
	    }

	    public static void main(String[] args) {
	    	OverLoading obj=new OverLoading();
	       // obj.sum(10,10);
	        System.out.println(OverLoading.sum(10,10));
	       // obj.sum(10,10,10);
	        System.out.println(OverLoading.sum(10,10,10));   
	        } 

   
	}


