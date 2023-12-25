/*Program to print the pattern:
           A A A A A
           B B B B B
           C C C C C
           D D D D D
           E E E E E
           F F F F F
 */

public class Pattern9
{
    public static void main(String[] args) 
    {
        //int A=65;
        for(int i=65;i<=70;i++)   
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print((char)i+" ");
            }
            System.out.println();
        }
    }
}


