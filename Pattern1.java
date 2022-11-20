/* Program to print the pattern:
          1 1 1 1
          2 2 2 2
          3 3 3 3
          4 4 4 4  */
class Pattern1
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=4;j++)
            { System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
