import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Reverse array");
		int arr[]={1,2,3,4,5};
		int mid= arr.length/2;
		int tem=0;
		System.out.println("MID:"+mid);
		for (int i=0; i<=mid;i++ ){
		    tem= arr[i];
		    arr[i]=arr[arr.length-1-i];
		    arr[arr.length-1-i]=tem;
		    
		    
		} 
		
		for (int i=0;i<arr.length ;i++ ){
		    System.out.print(arr[i]+" ");
		} 

	}
}


// Your Output
// Reverse array
// MID:2
// 5 4 3 2 1 