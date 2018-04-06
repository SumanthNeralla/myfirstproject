package gmailproject;

public class Stringnorepeatedchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ssuuryasrkala";
		char[] ch=str.toCharArray();
		boolean boo=true;
		int i;
	char nonRepetative=' ';
		for (i=0;i<ch.length;i++)
		{
			boo=true;
			if(ch[i]==' ')
				continue;
			for (int j=i+1; j< ch.length;j++)
			{
				
				if	(ch[i]==ch[j])
					{			
					ch[j]=' ';
					boo=false;
					break;
					
					}			
				
				
				
			}
		if(boo)
		{
			nonRepetative =ch[i];
		break;
		}
			}
			
		System.out.println(nonRepetative);	
		
		
		
	}
}
