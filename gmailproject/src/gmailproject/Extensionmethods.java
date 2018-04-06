package gmailproject;

interface Multiplication
	{ 
	int multiply(int a, int b); 
	default int square(int a)
		{ 
		//System.out.println(" I am in square");
		return multiply(a, a); 
		} 
	}

public class Extensionmethods implements Multiplication
{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Extensionmethods em = new Extensionmethods();
		System.out.println(em.multiply(2,3));
		System.out.println(em.square(5));
		//em.square(5);
		
	}

	
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
			return a*b;
	}

}
