package ArrList;
	class InvalidAgeException  extends Exception  
	{  
	    public InvalidAgeException (String str)  
	    {  
	        super(str);  
	    }  
	}  
	public class CustomException {
		static void validate(int age)throws InvalidAgeException
		{
			if(age<18)
			{
				throw new InvalidAgeException("Not Valid");
			}
			else
			{
				System.out.println("Welcome to Vote");
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try
			{
				validate(18);
			}
			catch(Exception m)
			{
				System.out.println("Exception Occured"+m);
			}
			System.out.println("Rest of the Code....");
		}

	}


