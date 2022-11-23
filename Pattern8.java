/*Program to print the pattern:
           1 3 5 7 9
           1 3 5 7 9
           1 3 5 7 9
           1 3 5 7 9
 */
public class Pattern8
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=4;i++)   
        {
            for(int j=1;j<=9;j+=2)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

