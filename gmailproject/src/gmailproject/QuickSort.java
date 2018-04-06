package gmailproject;

import java.text.MessageFormat;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
	
	int pivot= unsorted[(unsorted.length-1)/2];
	System.out.println(MessageFormat.format("String is \"{1}\", number is {0}.", 42, "foobar"));
	System.out.println(pivot);
	int temp;
	for (int i=0; i <unsorted.length;i++)
	{
	for (int j=0; j <unsorted.length;j++)
	{
		if( unsorted[j]> pivot)
		{
			temp=unsorted[j];
			unsorted[j]=unsorted[(unsorted.length-1)/2];
			unsorted[(unsorted.length-1)/2]=temp;
		}	
		if( unsorted[j]< pivot)
		{
			temp=unsorted[j];
			unsorted[j]=unsorted[(unsorted.length-1)/2];
			unsorted[(unsorted.length-1)/2]=temp;
		}
		
		System.out.println(" unsorted  "+j + " "+ unsorted[j] );
		for(int K=0; K <unsorted.length;K++)
		{
			System.out.print(unsorted[K]);
		}
		
		
	}
	pivot= unsorted[(unsorted.length-1)/2];
	System.out.println(" Pivot "+ unsorted[(unsorted.length-1)/2]  );
	}
	for(int i=0; i <unsorted.length;i++)
	{
		System.out.println(unsorted[i]);
	}
	
	
}

}
