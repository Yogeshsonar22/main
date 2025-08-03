import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
    System.out.println("Smallest elemnet in array & largest element in array");
    int arr[]={100,37,4,77,38,45,98};

    int large =arr[0];
    int small=arr[0];
    
    for (int i=0;i<arr.length;i++){
        
        if(arr[i]>=large ){
            large=arr[i];
            
        }
        if( arr[i]<=small){
            small=arr[i];
            
        }
        
        
    }
    System.out.println("Large: "+ large);
      System.out.println("small: "+ small);
	}
}
