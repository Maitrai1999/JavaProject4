package ArrList;

public class FinalMethod {

	public  void display() {
		System.out.println("maitrai");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new FinalMethod().display();
	}
    class Sample extends FinalMethod{
    	public final void display() {
    		System.out.println("maitrai");
    	}
    }
}

