import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {

        System.out.println("doing number in reverse");
        int num = 128;
           int rem=0;
        int rev = 0;

        while (num > 0) {
         rem = num % 10; //   8  2  1
            rev = rev * 10 + rem; // 8 82  821
 
            num = num / 10; // 12   1

        }
        System.out.println(rev);
    }
}