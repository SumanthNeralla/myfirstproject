package gmailproject;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Bob";
		str=str.toLowerCase();
		
		char[] st=str.toCharArray();
		char[] rev=str.toCharArray();
		int j=0;
		for (int i=st.length-1; i>=0;i--)
		{			
			rev[j]=st[i];
			System.out.println(rev[j]);
			j++;
		}
		String reversed=new String(rev);
		if (str.equals(reversed))
			System.out.println("Palindrom");
		else
			System.out.println("Not Palindrom");
		//System.out.println(reversed);
	}

}
