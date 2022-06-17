package ArrList;
class FatherName {
		   public String display() {
		      return "Father name in Lakshmi narayana";
		   }
		}

		class Name extends FatherName {
			@Override
		public String display() {
			      System.out.println(super.display());
			      return "my name is maitrai";
			   }
			}
		public class Overriding {
		   public static void main(String[] args) {
		      Name s = new Name();
		      System.out.println(s.display());
		   }
		}



		


