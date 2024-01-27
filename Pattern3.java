/* Program to print the pattern:
            1
            3 3
            5 5 5 
            7 7 7 7
            9 9 9 9 9*/

class Pattern3 
{
    public static void main(String[] args) 
    {
        int i,j;
        for(i=1;i<=9;i+=2)
        {
            for(j=1;j<=i;j+=2)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }   
    }
    
}
