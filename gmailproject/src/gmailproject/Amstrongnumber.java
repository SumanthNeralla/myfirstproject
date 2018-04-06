package gmailproject;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=125,r,sum=0;
		
		while (n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+(r*r*r);
		}
		
		System.out.println("Amstrong Number " + sum);
		
		

	}

}
