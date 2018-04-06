package gmailproject;

public class reverseofarray {
	public static void main(String[] args) {
		int[] n={1,2,3,4,5,6,7,8,9,10};
		int temp;
		for (int i=0; i<n.length/2; i++)
		{
			temp= n[i];
			n[i]=n[n.length-1-i];
			n[n.length-1-i]=temp;
		}
		for (int j:n)
		{
			System.out.println(j);
		}
	}
}
