package Prac;

public class Dggvh 
  {
public static void main(String[] args)
  {
int [] arr = {20,10,50,40,60};
 for(var i= 0 ; i<arr.length ; i++) 
 {
	 for(var j = i+1 ; j<arr.length ; j++) 
	 {
		if(arr[i]>arr[j]) 
		{
	
			var temp = arr[i];
			 arr[i] =arr[j];
			arr[j] = temp;
			
		}
	 }
	 
	 for(var r :arr) 
	 {
		 System.out.println(r);
	 } 
 }
 }
 }