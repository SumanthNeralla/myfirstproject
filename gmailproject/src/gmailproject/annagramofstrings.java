package gmailproject;

public class annagramofstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Mary";
		String str1="army";
		boolean isanna=true;
		if (str.length()==str1.length())
		{
			for (char c : str.toLowerCase().toCharArray())
			{
				if (str1.toLowerCase().indexOf(c)<0)
						{
							System.out.println("Not Annagram");
							isanna=false;
							break;							
						}
										
			}
		if (isanna)
		{
			System.out.println("Annagram");
		}
			
			
		}
	}

}
