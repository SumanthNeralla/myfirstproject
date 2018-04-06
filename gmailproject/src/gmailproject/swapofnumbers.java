package gmailproject;

public class swapofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5,j=10,temp;
		temp=i;
		i=j;
		j=temp;
		System.out.println(i+" "+j);
	
	// with out using temp variable
		
		int first=5, second=10;
		first=first-second;
		second=first+second;
		first=second-first;
		
		System.out.println(first+" "+second);
		
	
	}

}
