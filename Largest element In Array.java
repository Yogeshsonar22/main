import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Finding largest element in Array");
		
		int arr[]= {1,5,3,2,58,6,47, 88,97,787};
		int max=arr[0];
		for (int i=0;i<arr.length ;i++ ){   //  5  3 2 
		    for (int j=i+1;j<arr.length ;j++ ){  //3   2  58
		        
		        if(max<=arr[j]){
		            max=arr[j];//  5 
		            
		        }
		    } 
		} 
		System.out.println("Largest valus in array: "+ max);
		
	
	}
}
