package gmailproject;

public class Palindromeprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,r;
		int n=8546,temp;
		
		temp=n;
		while (n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if (temp==sum)
			System.out.println("Palindrome number");
		else 
			System.out.println("NOT a Palindrom number");
		
		System.out.println("reverse of number" +sum);
	}

}
