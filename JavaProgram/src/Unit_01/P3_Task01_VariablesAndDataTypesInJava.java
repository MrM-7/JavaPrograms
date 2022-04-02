package Unit_01;

/*
 - Variable in Java is a data container that saves the data values during Java Program execution.
 
 Types of Variables:
 - In Java there are three types of variables:
 
 	1. Local Variable - declared inside the body of a method 
 	
 	2. Instance Variable - These are defined without the static keyword.
 		- They are defined outside a method declaration 
 		- They are Object specific and are known as instance variables.
 		
 	3. Static Variables- 
 		- static variables are defined using STATIC keyword
 		- They are initialized only once, at the start of the program execution.
 		- These static variables should be initialized first, before the initialization of any other member
 * 
 */

public class P3_Task01_VariablesAndDataTypesInJava {
	
	static int q = 11;
	int p = 10;
	
	public static void main(String[] args) {
		
		// Valid Declarations
		int a, b, c;
		float pi;
		double d;
		char e;
		
		// Valid Initializations
		pi = 3.14f;
		d = 20.22d;
		e = 'v';
		
		a=10;
		b=20;
		c=30;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(e);
		
		int myNum = 5;  // Integer (whole number)
		float myFloatNum = 5.99f; // Floating Point Number
		char myLetter = 'D';   // Character
		boolean myBool = true; // Boolean
		String myText = "Hello"; // String 
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		
		/*
		 * Java Variable Type Conversion & Type Casting
		 */
		
		
		double f;
		int i=10;
		f=i;  // Implicit Type Conversion
		
		double g = 10;
		int j;
		j = (int)g;
		
		System.out.println(f);
		System.out.println(i);
		System.out.println(g);
		System.out.println(j);
		
		
		byte k=10; // 1 byte
		boolean l = true;
		long m = 10L;
		float n = 1.2f;
		double o = 1.2d;
		
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		
		
		System.out.println(ABC.j);  // data + functions
		// ABC.display()
		
		ABC obj1 = new ABC();
		System.out.println(obj1.i++);
		System.out.println(obj1.i);
		
		ABC obj2 = new ABC();
		System.out.println(obj2.i);
		
		//System.out.println(obj.j++);
		//System.out.println(obj1.j);
		//System.out.println(obj2.j);
		
		
		System.out.println(ABC.j++);
		System.out.println(ABC.j);
		
		ABC.typeCovnversionAndTypeCasting();	
	}
	
	int r = 10;
	
	void display() {
		
		int a = 5; // Local Variable
		System.out.println("This is Display Method!");
		System.out.println(a);
	}

}

class ABC {
	
	static int j=10;  // class variable/static variable
	int i=10;
	
	static void display() {
		
		int a=5;
		System.out.println("This is a Display Method!");
		System.out.println(a);
	}
	
	static void typeCovnversionAndTypeCasting() {
		
		/*
		 * double f; // 8 bytes = 64 bits/slots 	int i=10 // 4 bytes = 32 bits/slots 
		 * f = i // Type conversion 
		 * 
		 * double g = 10; // 64		int j = (int)g;
		 */
		
		double f;
		int i=10;
		f=i;
		System.out.println(f);
		
		double g = 10;
		int j;
		j = (int)g;
		
		System.out.println(i);
		System.out.println(j);
	}
}





