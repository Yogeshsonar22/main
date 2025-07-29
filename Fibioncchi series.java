import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {

     int num = 15;
     int a=0; int b=1; int c=0;
        System.out.println("fibonachhi series");
        for (int i=0;i<=num ;i++ )
        
        {
            System.out.print(c + " "); 
            c= a+b;
            a=b;
            b=c;
        }
        
       
    }
}

//output
//fibonachhi series
//0 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 