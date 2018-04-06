package gmailproject;

public class Reverseofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sumanth kumar is husband of Suryakala";
		char[] rev=str.toCharArray();
		for (int i=rev.length-1; i>= 0; i--)
			System.out.print(rev[i]);
		
		System.out.println(" ");
		
		String[] words=str.split("\\s");
		for (int i=words.length-1;i>=0;i--)
			System.out.print(words[i]+" ");
		
	}

}
