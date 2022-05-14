package Unit_03;
import java.util.Scanner;

class Test{
	int a=10;
	
	void basicException(){
		try{
			int b = a/0;
			System.out.println("B = "+b);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
		
	void multipleCatch(){
		try{
			int b=a/0;
			System.out.println("B = "+b);
		}
			
		catch(ArithmeticException e){
			System.out.println("First catch block");
			System.out.println(e.getMessage());
		}
			
		catch(Exception e){
			System.out.println("Second catch block");
			System.out.println(e.getMessage());
		}
	}
	
		
	void inputMismatchException(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value: ");
			
		try{
			int c = sc.nextInt();
			System.out.println("C = "+c);
		}
		catch(Exception e){
			System.out.println(e+ " Resolved");
		}
		
		finally {
			sc.close();
		}
	}
	
		
	void stackOverFlowError(){
		int c=1;
			
		try{
			if(c>0)
				stackOverFlowError();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{				
			System.out.println("Other code execution");
		}
	}
	
		
	void useOfThrow(int age) throws Exception{
		if(age<18)
			throw new Exception();
		else
			System.out.println("Age: "+age);
	}
	
	
	void NullPointerException()
	{
		String s = null;
		try {
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	void IndexOutofbound()
	{
		int a[] = {1,2,4};
		
		try {
			System.out.println(a[22]);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	void manualException(int a) throws ManualException {
		if(a==10)
			throw new ManualException();
	}
	
}

public class P14_ExceptionHandling {

	public static void main(String[] args) {
		Test obj = new Test();
		obj.basicException();
		obj.multipleCatch();
		obj.inputMismatchException();
		//obj.stackOverFlowError();
		
		try {
			obj.useOfThrow(15);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		obj.NullPointerException();
		obj.IndexOutofbound();
		
		try {
			obj.manualException(10);
		}
		catch (ManualException e) {
			System.out.println(e.getMessage());
		}
	}
}


class ManualException extends Exception
{
	public String getMessage()
	{
		String detailMessage = "Exception here!!!!";
		return detailMessage;
	}
}


