package gmailproject;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=50;
		int count=0;
		System.out.println(10/2);
		System.out.println(2%2);
		
		for(int i=2;i<=num;i++){
		 
			count=0;
		 
			for(int j=2;j<=i/2;j++){
		 
				if(i%j==0){
					count++;
					break;
					}
		 
			}
		 
		if(count==0){		 
			System.out.println(i);
		 
			}
	}

	}
}

