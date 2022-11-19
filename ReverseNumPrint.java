/*Program which ask for an integer from the users and it reverse the integer and print same, after
reversal the number is same as old number, otherwise it prints not same */
import java.util.*;
public class ReverseNumPrint
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num=sc.nextInt();
        int a,n=0;
        while(num!=0)
        {
            n=n*10;
            a=num%10;
            n=n+a;
            num/=10;  
        }
        if(num==n)
         System.out.println("Reversed Number is same as entered number");
        else
         System.out.println("Reversed Number is not same as entered number");
    }
}

