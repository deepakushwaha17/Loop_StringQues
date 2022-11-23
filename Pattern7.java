/*Program to print the pattern:
           2 2 2 2 2
           4 4 4 4 4
           6 6 6 6 6
           8 8 8 8 8
 */
public class Pattern7 
{
    public static void main(String[] args) 
    {
        for(int i=2;i<=8;i+=2)   
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
