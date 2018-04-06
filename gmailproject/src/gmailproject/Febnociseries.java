package gmailproject;

public class Febnociseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("febnoci series");
		int n1=1,n2=2,n3;
		System.out.print(n1+" "+n2);
		for (int j=2; j<10; ++j)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		
	}

}
