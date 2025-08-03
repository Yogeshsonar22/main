import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		   int[] arr = {12, 45, 1, 798, 3, 90, 47};
		   
		   System.out.println("Finding  Largest Element from Array:");
		   int large=arr[0];
		   int smallest=arr[0];
            int secondsmallest=arr[0];
            int Thirdlarge=arr[0];
            int SecondLargest=arr[0];
		   for (int i=0;i<arr.length ; i++){
		       if(arr[i]>large){
		           large=arr[i];
		       }
		   } 
		   System.out.println("large: "+large);
		   
		    System.out.println("SecondLargest emelent from array");
		    
		    for (int i=0;i<arr.length ;i++ ){
		        if(arr[i]>SecondLargest && arr[i]!=large){
		            SecondLargest=arr[i];
		            
		            
		        }
		    } 
		    System.out.println("SecondLargest: "+SecondLargest);
		    
		    for(int i=0;i<arr.length;i++){
		        if(arr[i]>Thirdlarge && arr[i]!=large && arr[i]!=SecondLargest){
		            Thirdlarge=arr[i];
		            
		        }
		    }
		     System.out.println("Thirdlarge: "+Thirdlarge);
		    
 //---------------------for smallest element Array----------------------
 
		   System.out.println("finding smalled Element from Array");
		  
		  for (int i=0;i<arr.length;i++){
		      if(arr[i]<smallest){
		          smallest=arr[i];
		      }
		  }
		  System.out.println("smallest: "+ smallest);
		  
		  System.out.println("Finding second smallest element from array: ");
		  
		  for (int i=0;i<arr.length;i++){
		      if(arr[i]<secondsmallest && arr[i]!=smallest){
		          secondsmallest=arr[i];
		      }
		  }
		  System.out.println("secondsmallest: "+secondsmallest);
		  
	}
}






// //output
// Finding  Largest Element from Array:
// large: 798
// SecondLargest emelent from array
// SecondLargest: 90
// Thirdlarge: 47
// finding smalled Element from Array
// smallest: 1
// Finding second smallest element from array: 
// secondsmallest: 3

//Logic

//if(arr[i]<secondsmallest && arr[i]!=smallest)

// 12 ≠ 90 and 12 > secondLargest → secondLargest = 12

// 45 ≠ 90 and 45 > 12 → secondLargest = 45

// 1 ≠ 90 and 1 > 45 → ❌

// 78 ≠ 90 and 78 > 45 → ✅ secondLargest = 78

// 23 ≠ 90 and 23 > 78 → ❌

// 90 == 90 → ❌ (skip)

// 45 ≠ 90 and 45 > 78 → ❌