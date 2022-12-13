//Java program to check entered string is palindrome or not.
import java.util.*;
public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        str=str.toLowerCase();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if(rev==str)
         System.out.println("Palindrome String.");
          else
         System.out.println("Not a Palindrome String.");
    } 
}
