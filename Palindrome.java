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
        str=str.trim();
        String temp=str;
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(temp.equals(rev))
         System.out.println("Palindrome String.");
          else
         System.out.println("Not a Palindrome String.");
    } 
}