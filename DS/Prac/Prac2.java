package Prac;

public class Prac2 
		{

	public static void main(String[] args) 	
	{	
	int [] sort  = new int [] {1,2,3,4,5};
/*		int temp;
		for(int i = 0 ; i<sort.length;i++)
		{
	            for(int j = i ; j<sort.length;j++)
	           {
	            		if(sort[i]>sort[j])
	            		{
		                	 temp = sort[i];
	                         sort[i] = sort[j]; 
	                         sort[j] = temp; 
	            		}
	            	}
				}
		for(int a: sort) {
					System.out.println(a);
			}*/

		for(int i = 0 ; i<sort.length;i++)
		{
	            for(int j = i ; j<sort.length;j++)
	           {
	                     System.out.println(sort[j]+"--------");       	
	           }
//	            System.out.println(sort[i]);
		  }
		}
	}
