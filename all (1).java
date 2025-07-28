import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	System.out.println("Cheking number is prime or not");
	int num= 128;
	int no=num;
	int rev=0;
	
	while(num>0){
	    int rem = num%10;  //3  2
	   rev= rev *10+rem;   //0  32
	    num=num/10;       // 12
	    
	}
	if (rev==no)
	System.out.println("pallidrome");
	else
	System.out.println("Not");
	}
}
