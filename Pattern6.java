/*Program to print the pattern:
                *
                * *
                * * *
                * * * *
                * * *
                * *
                *
 */
class Pattern6 
{
    public static void main(String[] args) 
    {
        int a;
        for(int i=1;i<8;i++)
        {
            a=(i<=4)?i:8-i;
            if(a==i)
            {
                for(int j=1;j<=a;j++)
                {
                    System.out.print("* ");
                }
            }
           else
            {
                for(int k=1;k<=a;k++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    
}
